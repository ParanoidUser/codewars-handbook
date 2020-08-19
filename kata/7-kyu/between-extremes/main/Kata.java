import static java.util.Arrays.stream;

interface Kata {
  static int betweenExtremes(int[] numbers) {
    var stats = stream(numbers).summaryStatistics();
    return stats.getMax() - stats.getMin();
  }
}
