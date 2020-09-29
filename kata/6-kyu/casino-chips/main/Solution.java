import static java.util.stream.IntStream.of;

interface Solution {
  static int solve(int[] arr) {
    var stats = of(arr).summaryStatistics();
    return (int) Math.min(stats.getSum() / 2, stats.getSum() - stats.getMax());
  }
}