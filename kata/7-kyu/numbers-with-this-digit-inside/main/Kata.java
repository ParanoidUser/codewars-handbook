import static java.util.stream.LongStream.of;
import static java.util.stream.LongStream.rangeClosed;

interface Kata {
  static long[] numbersWithDigitInside(long x, long d) {
    long[] nums = rangeClosed(1, x).filter(i -> ("" + i).contains("" + d)).toArray();
    return new long[] {nums.length, of(nums).sum(), of(nums).reduce((a, b) -> a * b).orElse(0L)};
  }
}
