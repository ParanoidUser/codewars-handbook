import java.math.BigInteger;

interface ReverseEuclid {
  static BigInteger[] findInitialNumbers(long divisor, long iterations) {
    var init = new BigInteger[]{BigInteger.valueOf(divisor), BigInteger.valueOf(iterations > 0 ? divisor : 0)};
    while (iterations-- > 0) {
      init[0] = init[0].add(init[1]);
      init[1] = init[0].subtract(init[1]);
    }
    return init;
  }
}