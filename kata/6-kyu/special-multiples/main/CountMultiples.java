import java.math.BigInteger;

interface CountMultiples {
  static long countSpecMult(long n, long mxval) {
    long product = 2;
    for (var i = BigInteger.valueOf(3); n-- > 1; i = i.nextProbablePrime()) {
      product *= i.longValue();
    }
    return mxval / product;
  }
}
