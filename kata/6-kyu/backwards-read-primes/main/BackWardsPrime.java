import java.math.BigInteger;
import java.util.ArrayList;

interface BackWardsPrime {
  static String backwardsPrime(long start, long end) {
    var primes = new ArrayList<String>();
    var prime = BigInteger.valueOf(start - 1);
    while ((prime = prime.nextProbablePrime()).longValue() <= end) {
      String s = prime + "";
      String r = new StringBuilder(s).reverse() + "";
      if (!r.equals(s) && new BigInteger(r).isProbablePrime(10)) {
        primes.add(s);
      }
    }
    return String.join(" ", primes);
  }
}
