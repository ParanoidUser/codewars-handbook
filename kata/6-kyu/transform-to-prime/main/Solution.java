import static java.math.BigInteger.valueOf;
import static java.util.stream.IntStream.of;

interface Solution {
  static int minimumNumber(int[] numbers) {
    int sum = of(numbers).sum();
    return valueOf(sum - 1L).nextProbablePrime().intValue() - sum;
  }
}
