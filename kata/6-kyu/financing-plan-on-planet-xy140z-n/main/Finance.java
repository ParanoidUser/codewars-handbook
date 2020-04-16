import java.math.BigInteger;

class Finance {
  static BigInteger finance(long n) {
    return BigInteger.valueOf(n * ++n * ++n / 2);
  }
}
