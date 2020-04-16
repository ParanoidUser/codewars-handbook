import static java.util.stream.DoubleStream.of;

class Kata {
  static double magnitude(double[] vector) {
    return Math.sqrt(of(vector).map(n -> n * n).sum());
  }
}
