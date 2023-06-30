import java.math.BigInteger;
import java.util.function.LongPredicate;

import static java.util.stream.LongStream.range;

interface GapInPrimes {
  static long[] gap(int g, long m, long n) {
    LongPredicate prime = l -> BigInteger.valueOf(l).isProbablePrime(9);
    return range(m, n - g)
            .filter(i -> prime.test(i) && prime.test(i + g) && range(i + 1, i + g).noneMatch(prime))
            .mapToObj(i -> new long[]{i, i + g}).findFirst().orElse(null);
  }
}