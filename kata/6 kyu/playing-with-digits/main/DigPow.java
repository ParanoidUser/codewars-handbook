import static java.util.stream.IntStream.range;

class DigPow {
  static long digPow(int n, int p) {
    int sum = range(0, (n + "").length()).map(i -> (int) Math.pow((n + "").charAt(i) - 48, i + p)).sum();
    return sum % n == 0 ? sum / n : -1;
  }
}
