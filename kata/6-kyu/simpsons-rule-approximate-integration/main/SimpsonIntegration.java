import static java.util.stream.IntStream.rangeClosed;

import java.util.function.DoubleUnaryOperator;

interface SimpsonIntegration {
  static double simpson(int n) {
    DoubleUnaryOperator fn = num -> 1.5 * Math.pow(Math.sin(num), 3);
    double h = Math.PI / n;
    return 2 * h * (2 * rangeClosed(1, n / 2).mapToDouble(i -> fn.applyAsDouble((2 * i - 1) * h)).sum() + rangeClosed(1, n / 2 - 1).mapToDouble(i -> fn.applyAsDouble(2 * i * h)).sum()) / 3;
  }
}
