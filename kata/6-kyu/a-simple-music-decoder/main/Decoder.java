import static java.util.Optional.ofNullable;
import static java.util.function.Function.identity;
import static java.util.regex.Pattern.compile;
import static java.util.stream.IntStream.iterate;
import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;

import java.util.stream.IntStream;

class Decoder {
  int[] uncompress(String music) {
    return of(music.split(",")).map(this::decode).flatMapToInt(identity()).toArray();
  }

  IntStream decode(String signal) {
    var repeatable = compile("(-?\\d+)\\*(-?\\d+)").matcher(signal);
    if (repeatable.find()) {
      return range(0, Integer.parseInt(repeatable.group(2))).map(i -> Integer.parseInt(repeatable.group(1)));
    }
    var sequential = compile("(-?\\d+)-(-?\\d+)(/(-?\\d+))?").matcher(signal);
    if (sequential.find()) {
      var from = Integer.parseInt(sequential.group(1));
      var to = Integer.parseInt(sequential.group(2));
      var step = Integer.parseInt(ofNullable(sequential.group(4)).orElse("1"));
      return iterate(from, i -> to > from ? i <= to : i >= to, i -> to > from ? i + step : i - step);
    }
    return IntStream.of(Integer.parseInt(signal));
  }
}
