import static java.util.Arrays.stream;
import static java.util.stream.LongStream.of;

class SumDigNth {
  static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {
    long a = stream(patternl, 0, --nthterm % patternl.length).sum();
    long b = of(patternl).sum() * nthterm / patternl.length;
    return (initval + a + b + "").chars().map(c -> c - 48).sum();
  }
}
