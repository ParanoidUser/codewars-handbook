import java.math.BigInteger;

class BinaryGCD {
  static int gcdBinary(int x, int y) {
    return BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).bitCount();
  }
}
