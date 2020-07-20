import java.math.BigInteger;

interface Finance {
  static BigInteger finance(long n) {
    return BigInteger.valueOf(n * ++n * ++n / 2);
  }
}
