import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.joining;
import static java.util.stream.DoubleStream.of;
import static java.util.stream.IntStream.iterate;

interface SignalProcessor {
  static int[] process(double[] rawData) {
    var bin = of(rawData).mapToObj(d -> d < 4.8 ? "0" : "1").collect(joining());
    int len = parseInt(bin.substring(0, 4), 2);
    return iterate(4, i -> i <= bin.length() - len, i -> i + len).map(i -> parseInt(bin.substring(i, i + len), 2)).toArray();
  }
}