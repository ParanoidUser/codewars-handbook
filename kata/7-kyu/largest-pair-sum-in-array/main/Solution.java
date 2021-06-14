import static java.util.Comparator.reverseOrder;
import static java.util.stream.IntStream.of;

interface Solution {
  static int largestPairSum(int[] numbers) {
    return of(numbers).boxed().sorted(reverseOrder()).limit(2).mapToInt(i -> i).sum();
  }
}