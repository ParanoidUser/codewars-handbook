import static java.util.stream.IntStream.of;

class MinMax {
  static int[] minMax(int[] arr) {
    var stats = of(arr).summaryStatistics();
    return new int[] {stats.getMin(), stats.getMax()};
  }
}
