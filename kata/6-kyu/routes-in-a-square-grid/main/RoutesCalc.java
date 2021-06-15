import static java.util.stream.IntStream.rangeClosed;

interface RoutesCalc {
  static long calculateRoutes(int n) {
    var r = new long[]{1};
    rangeClosed(1, n).forEach(i -> r[0] += r[0] * n / i);
    return n > 0 ? r[0] : 0;
  }
}