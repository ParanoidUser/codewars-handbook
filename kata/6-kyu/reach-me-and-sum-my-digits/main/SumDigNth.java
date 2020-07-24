import static java.util.Arrays.stream;
import static java.util.stream.LongStream.of;

interface SumDigNth {
  static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {
    long a = stream(patternl, 0, --nthterm % patternl.length).sum();
    long b = nthterm / patternl.length * of(patternl).sum();
    return (initval + a + b + "").chars().map(c -> c - 48).sum();
  }
}