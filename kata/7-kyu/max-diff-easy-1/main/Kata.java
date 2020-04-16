import static java.util.stream.IntStream.of;

class Kata {
  static int maxDiff(int[] lst) {
    if (lst.length < 2) return 0;
    var stats = of(lst).summaryStatistics();
    return stats.getMax() - stats.getMin();
  }
}
