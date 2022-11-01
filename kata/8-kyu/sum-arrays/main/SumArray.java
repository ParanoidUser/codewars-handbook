import static java.util.stream.DoubleStream.of;

interface SumArray {
  static double sum(double[] numbers) {
    return of(numbers).sum();
  }
}