import static java.util.stream.IntStream.range;

import java.math.BigInteger;
import java.util.function.IntBinaryOperator;

interface Solution {
  static int sumDifferencesBetweenProductsAndLCMs(int[][] p) {
    IntBinaryOperator gcd = (a, b) -> Math.max(BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue(), 1);
    return range(0, p.length).reduce(0, (s, i) -> s + p[i][0] * p[i][1] - p[i][0] * p[i][1] / gcd.applyAsInt(p[i][0], p[i][1]));
  }
}
