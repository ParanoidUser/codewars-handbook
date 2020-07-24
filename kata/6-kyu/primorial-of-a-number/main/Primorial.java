import static java.util.stream.IntStream.range;

import java.math.BigInteger;

interface Primorial {
  static String numPrimorial(int n) {
    return range(2, Integer.MAX_VALUE).mapToObj(BigInteger::valueOf).filter(l -> l.isProbablePrime(100)).limit(n).reduce(BigInteger.ONE, BigInteger::multiply) + "";
  }
}
