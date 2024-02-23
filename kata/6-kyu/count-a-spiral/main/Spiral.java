import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

import java.math.BigInteger;

interface Spiral {
  static BigInteger sum(BigInteger size) {
    return size.add(ONE).pow(2).divide(TWO).subtract(ONE);
  }
}