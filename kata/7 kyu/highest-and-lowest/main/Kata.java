import static java.util.Arrays.stream;

class Kata {
  static String highAndLow(String numbers) {
    var stats = stream(numbers.split("\\s")).mapToInt(Integer::parseInt).summaryStatistics();
    return stats.getMax() + " " + stats.getMin();
  }
}
