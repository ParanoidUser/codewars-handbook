import static java.util.stream.IntStream.range;

interface ArcParabLen {
  static double lenCurve(int n) {
    return range(0, n).mapToDouble(i -> Math.sqrt(1. / n / n + Math.pow((i + i + 1.) / n / n, 2))).sum();
  }
}
