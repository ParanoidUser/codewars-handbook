import static java.math.BigInteger.valueOf;
import static java.util.stream.IntStream.iterate;

import java.util.List;

interface Primes {
  static List<Integer> primes(Integer x) {
    return iterate(2, i -> i <= x, i -> i + 1).filter(i -> valueOf(i).isProbablePrime(10)).boxed().toList();
  }
}