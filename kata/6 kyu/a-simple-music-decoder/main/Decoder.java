import static java.util.Optional.ofNullable;
import static java.util.function.Function.identity;
import static java.util.regex.Pattern.compile;
import static java.util.stream.IntStream.iterate;
import static java.util.stream.IntStream.range;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Decoder {
  static int[] uncompress(String music) {
    return Stream.of(music.split(",")).map(Decoder::decode).flatMapToInt(identity()).toArray();
  }

  static IntStream decode(String signal) {
    var repeatable = compile("(-?\\d+)\\*(-?\\d+)").matcher(signal);
    if (repeatable.find()) {
      return range(0, Integer.parseInt(repeatable.group(2))).map(i -> Integer.parseInt(repeatable.group(1)));
    }

    var sequential = compile("(-?\\d+)-(-?\\d+)(/(-?\\d+))?").matcher(signal);
    if (sequential.find()) {
      int from = Integer.parseInt(sequential.group(1));
      int to = Integer.parseInt(sequential.group(2));
      int step = Integer.parseInt(ofNullable(sequential.group(4)).orElse("1"));
      return iterate(from, i -> to > from ? i <= to : i >= to, i -> to > from ? i + step : i - step);
    }

    return IntStream.of(Integer.parseInt(signal));
  }
}
