import static java.math.BigInteger.valueOf;
import static java.util.stream.LongStream.iterate;

interface BeforeAfterPrimes {
  static long[] primeBefAft(long num) {
    return new long[] {
      iterate(num - 1, i -> i - 1).filter(i -> valueOf(i).isProbablePrime(9)).findFirst().orElse(0),
      valueOf(num).nextProbablePrime().longValue()
    };
  }
}
