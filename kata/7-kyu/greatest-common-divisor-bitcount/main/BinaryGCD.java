import java.math.BigInteger;

interface BinaryGCD {
  static int gcdBinary(int x, int y) {
    return BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).bitCount();
  }
}
