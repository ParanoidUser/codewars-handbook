import static java.math.BigInteger.valueOf;
import static java.util.stream.LongStream.iterate;
import static java.util.stream.LongStream.rangeClosed;

import java.util.function.LongPredicate;

interface OddDigPrime {
  static long[] onlyOddDigPrimes(long n) {
    LongPredicate op = x -> valueOf(x).isProbablePrime(10) && (x + "").chars().allMatch(i -> i % 2 > 0);
    var count = rangeClosed(3, n).filter(op).count();
    var primes = iterate(3, i -> i + 1).filter(op).limit(count + 1).boxed().toList();
    return new long[]{count, primes.get(primes.size() - 2), primes.get(primes.size() - 1)};
  }
}