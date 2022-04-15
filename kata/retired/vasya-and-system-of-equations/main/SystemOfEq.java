import static java.util.stream.IntStream.rangeClosed;

interface SystemOfEq {
  static int Solution(int n, int m) {
    return (int) rangeClosed(0, n / 2).filter(i -> Math.pow(n - (double) i * i, 2) == m - i).count();
  }
}