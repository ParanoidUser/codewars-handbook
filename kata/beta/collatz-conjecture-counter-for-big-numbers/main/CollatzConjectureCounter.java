import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;
import static java.math.BigInteger.ZERO;
import static java.util.stream.Stream.iterate;

import java.math.BigInteger;

interface CollatzConjectureCounter {
  static long countCollatzNumbers(BigInteger n) {
    return iterate(n, i -> !i.equals(ONE), i -> i.mod(TWO).equals(ZERO) ? i.divide(TWO) : i.multiply(ONE.add(TWO)).add(ONE)).count();
  }
}