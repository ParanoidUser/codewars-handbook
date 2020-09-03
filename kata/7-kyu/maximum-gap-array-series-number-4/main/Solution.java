import static java.util.Arrays.sort;
import static java.util.stream.IntStream.range;

interface Solution {
  static int maxGap(int[] numbers) {
    sort(numbers);
    return range(0, numbers.length - 1).sorted().map(i -> numbers[i + 1] - numbers[i]).max().orElse(0);
  }
}
