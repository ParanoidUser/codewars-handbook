import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

interface JomoPipi {
  List<BigInteger> cache = new ArrayList<>();

  static BigInteger pipi(int n) {
    if (n < cache.size()) {
      return cache.get(n);
    }
    var pn = BigInteger.valueOf(n);
    for (int i = 0; i < n; i++) {
      pn = (pn = pn.subtract(pipi(i))).multiply(pn);
    }
    cache.add(pn);
    return pn;
  }
}