import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static boolean hasTwoCubeSums(int n) {
    return rangeClosed(1, (int) Math.cbrt(n))
        .filter(a -> rangeClosed(a, (int) Math.cbrt(n)).anyMatch(b -> a * a * a + b * b * b == n))
        .count() > 1;
  }
}
