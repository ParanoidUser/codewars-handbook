import static java.math.BigInteger.valueOf;
import static java.util.stream.LongStream.range;

class StepInPrimes {
  static long[] step(int g, long m, long n) {
    return range(m, n - g)
        .filter(l -> valueOf(l).isProbablePrime(2) && valueOf(l + g).isProbablePrime(2))
        .mapToObj(l -> new long[] {l, l + g})
        .findFirst()
        .orElse(null);
  }
}
