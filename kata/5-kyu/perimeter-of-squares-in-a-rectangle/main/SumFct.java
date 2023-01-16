import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.valueOf;
import static java.util.stream.Stream.iterate;

import java.math.BigInteger;

interface SumFct {
  static BigInteger perimeter(BigInteger n) {
    return iterate(new BigInteger[]{ONE, ONE}, i -> new BigInteger[]{i[1], i[0].add(i[1])})
        .limit(n.intValue()).map(a -> a[1]).reduce(ZERO, BigInteger::add).add(ONE).multiply(valueOf(4));
  }
}