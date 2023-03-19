import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;
import static java.math.BigInteger.ZERO;

import java.math.BigInteger;

interface Chess {
  static BigInteger queens(BigInteger n) {
    return n.compareTo(ZERO) > 0 ? n.subtract(TWO).multiply(n.subtract(ONE)) : ZERO;
  }
}