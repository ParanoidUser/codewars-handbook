import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

interface QuickCalc {
  static BigInteger choose(long n, long p) {
    return p > 0 ? choose(n, p - 1).multiply(valueOf(n - p + 1)).divide(valueOf(p)) : BigInteger.ONE;
  }
}
