import static java.math.BigInteger.valueOf;

interface SimpleMath {
  static boolean[] numberProperty(int n) {
    return new boolean[]{n > 0 && valueOf(n).isProbablePrime(9), n % 2 == 0, n % 10 == 0};
  }
}