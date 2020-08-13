import static java.util.stream.IntStream.range;

interface Solution {
  static String jumpingNumber(int number) {
    String s = "" + number;
    return number > 9 && range(0, s.length() - 1).anyMatch(i -> Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1) ? "Not!!" : "Jumping!!";
  }
}
