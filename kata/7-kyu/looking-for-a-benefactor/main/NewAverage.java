import static java.util.stream.DoubleStream.of;

interface NewAverage {
  static long newAvg(double[] arr, double navg) {
    double add = (arr.length + 1) * navg - of(arr).sum();
    if (add > 0) return (long) Math.ceil(add);
    throw new IllegalArgumentException("Expected New Average is too low");
  }
}
