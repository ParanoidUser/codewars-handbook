import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

interface Diagonal {
  static BigInteger diagonal(int n, int p) {
    var sum = ONE;
    var prev = ONE;
    var bp = valueOf(p);
    for (BigInteger i = ONE; i.intValue() < n - p + 1; i = i.add(ONE)) {
      prev = prev.multiply(bp.add(i)).divide(i);
      sum = sum.add(prev);
    }
    return sum;
  }
}
