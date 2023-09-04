import static java.util.stream.IntStream.range;

import java.util.List;
import java.util.function.DoubleUnaryOperator;

interface ApproxInter {
  static List<Double> interp(DoubleUnaryOperator f, double l, double u, int n) {
    return range(0, n).mapToObj(i -> Math.floor(100 * f.applyAsDouble(i * (u - l) / n + l)) / 100).toList();
  }
}