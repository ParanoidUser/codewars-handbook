import static java.util.stream.IntStream.of;

interface MinMax {
  static int[] minMax(int[] arr) {
    var stats = of(arr).summaryStatistics();
    return new int[] {stats.getMin(), stats.getMax()};
  }
}
