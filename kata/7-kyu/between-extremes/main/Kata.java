import static java.util.Arrays.stream;

class Kata {
  static int betweenExtremes(int[] numbers) {
    var stats = stream(numbers).summaryStatistics();
    return stats.getMax() - stats.getMin();
  }
}
