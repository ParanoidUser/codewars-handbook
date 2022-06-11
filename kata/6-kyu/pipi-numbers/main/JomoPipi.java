import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

interface JomoPipi {
  static BigInteger pipi(int n) {
    if (n < Cache.NUMBERS.size()) {
      return Cache.NUMBERS.get(n);
    }
    var pn = BigInteger.valueOf(n);
    for (var i = 0; i < n; i++) {
      pn = pn.subtract(pipi(i));
      pn = pn.multiply(pn);
    }
    Cache.NUMBERS.add(pn);
    return pn;
  }

  class Cache {
    private Cache() { }
    private static final List<BigInteger> NUMBERS = new ArrayList<>();
  }
}