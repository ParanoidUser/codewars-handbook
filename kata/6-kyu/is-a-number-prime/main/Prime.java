import static java.math.BigInteger.valueOf;

interface Prime {
  static boolean isPrime(int num) {
    return num > 1 && valueOf(num).isProbablePrime(10);
  }
}
