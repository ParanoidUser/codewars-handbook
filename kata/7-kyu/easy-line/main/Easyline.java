import java.math.BigInteger;

interface Easyline {
  static BigInteger easyLine(int n) {
    BigInteger c = BigInteger.ONE, sum = BigInteger.ONE;
    for (var i = 0; i <= n; i++) {
      c = c.multiply(BigInteger.valueOf(n - (long) i)).divide(BigInteger.valueOf(i + (long)1));
      sum = sum.add(c.multiply(c));
    }
    return sum;
  }
}
