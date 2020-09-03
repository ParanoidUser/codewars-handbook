import static java.util.Comparator.reverseOrder;
import static java.util.stream.IntStream.of;

interface Solution {
  static int maxTriSum(int[] numbers) {
    return of(numbers).boxed().sorted(reverseOrder()).distinct().limit(3).mapToInt(i -> i).sum();
  }
}
