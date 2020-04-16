import java.math.BigInteger;

class BinaryScore {
  static BigInteger score(BigInteger n) {
    return BigInteger.ZERO.setBit(n.bitLength()).subtract(BigInteger.ONE);
  }
}
