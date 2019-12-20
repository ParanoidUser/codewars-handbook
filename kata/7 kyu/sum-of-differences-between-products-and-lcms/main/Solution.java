import static java.util.stream.IntStream.range;

import java.math.BigInteger;

class Solution {
  static int sumDifferencesBetweenProductsAndLCMs(int[][] p) {
    return range(0, p.length).reduce(0, (s, i) -> s + p[i][0] * p[i][1] - p[i][0] * p[i][1] / gcd(p[i][0], p[i][1]));
  }

  static int gcd(int a, int b) {
    return Math.max(BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue(), 1);
  }
}
