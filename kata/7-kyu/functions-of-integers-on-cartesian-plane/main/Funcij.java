import java.math.BigInteger;

interface Funcij {
  static BigInteger sumin(long n) {
    return BigInteger.valueOf(n * (n + 1) * (2 * n + 1) / 6);
  }

  static BigInteger sumax(long n) {
    return BigInteger.valueOf(n * n * n - n * (n - 1) * (2 * n - 1) / 6);
  }

  static BigInteger sumsum(int n) {
    return sumin(n).add(sumax(n));
  }
}