import static java.util.stream.IntStream.range;

interface NthSeries {
  static String seriesSum(int n) {
    return String.format("%.2f", range(0, n).mapToDouble(num -> 1. / (num * 3 + 1)).sum());
  }
}
