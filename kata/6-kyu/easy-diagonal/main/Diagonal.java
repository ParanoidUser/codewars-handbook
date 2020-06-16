import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

interface Diagonal {
  static BigInteger diagonal(int n, int p) {
    BigInteger sum = ONE, bp = valueOf(p);
    for (BigInteger i = ONE, prev = ONE; i.intValue() < n - p + 1; i = i.add(ONE)) {
      sum = sum.add(prev = prev.multiply(bp.add(i)).divide(i));
    }
    return sum;
  }
}
