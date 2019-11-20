import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

import java.math.BigInteger;

class BinarySxore {
  static BigInteger sxore(BigInteger n) {
    return new BigInteger[] {n, ONE, n.add(ONE), ZERO}[n.mod(new BigInteger("4")).intValue()];
  }
}
