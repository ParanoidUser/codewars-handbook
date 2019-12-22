package codewars.triangle;

import java.math.BigInteger;

class TriangularNumbers {
  static BigInteger numberOfDots(BigInteger n) {
    return n.add(BigInteger.ONE).multiply(n).divide(BigInteger.TWO);
  }
}
