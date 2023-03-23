import java.math.BigInteger;

interface Kata {
  static int lastDigit(BigInteger a, BigInteger b) {
    return a.modPow(b, BigInteger.TEN).intValue();
  }
}