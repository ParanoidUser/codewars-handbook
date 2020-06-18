import static java.math.BigInteger.ONE;

import java.math.BigInteger;

interface GreatestSmallest {
  static BigInteger greatest(BigInteger x, BigInteger y, BigInteger n) {
    var lcm = x.multiply(y).divide(x.gcd(y));
    return n.subtract(ONE).divide(lcm).multiply(lcm);
  }

  static BigInteger smallest(BigInteger x, BigInteger y, BigInteger n) {
    var lcm = x.multiply(y).divide(x.gcd(y));
    return n.divide(lcm).add(ONE).multiply(lcm);
  }
}