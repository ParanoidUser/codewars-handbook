import static java.util.stream.IntStream.range;

interface LargestFiveDigitNumber {
  static int solve(String digits) {
    return range(0, digits.length() - 4).map(i -> Integer.parseInt(digits.substring(i, i + 5))).max().orElse(0);
  }
}