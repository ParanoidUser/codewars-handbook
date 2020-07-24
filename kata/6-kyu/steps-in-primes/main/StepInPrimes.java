import static java.math.BigInteger.valueOf;
import static java.util.stream.LongStream.range;

interface StepInPrimes {
  static long[] step(int g, long m, long n) {
    return range(m, n - g)
        .filter(l -> valueOf(l).isProbablePrime(10) && valueOf(l + g).isProbablePrime(10))
        .mapToObj(l -> new long[] {l, l + g})
        .findFirst()
        .orElse(null);
  }
}
