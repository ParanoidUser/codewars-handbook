import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

interface Solution {
  static BigInteger sumOfSums(int n) {
    var i = valueOf(n++).multiply(valueOf(n++)).multiply(valueOf(n)).divide(valueOf(6));
    return i.multiply(i.add(BigInteger.ONE)).divide(BigInteger.TWO);
  }
}