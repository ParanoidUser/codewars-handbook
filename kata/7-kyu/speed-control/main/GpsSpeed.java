import static java.util.stream.IntStream.range;

interface GpsSpeed {
  static int gps(int s, double[] x) {
    return (int) Math.floor(range(0, x.length - 1).mapToDouble(i -> (x[i + 1] - x[i]) * 3600 / s).max().orElse(0));
  }
}
