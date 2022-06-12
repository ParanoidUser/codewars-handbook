import static java.math.BigInteger.valueOf;

interface Solution {
  static long solve(long n) {
    for (long l = 0; ; l++) {
      if (valueOf(n - l).isProbablePrime(9)) {
        return n - l;
      }
      if (valueOf(n + l).isProbablePrime(9)) {
        return n + l;
      }
    }
  }
}