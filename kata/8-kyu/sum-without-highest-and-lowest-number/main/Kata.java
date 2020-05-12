import static java.util.Comparator.reverseOrder;
import static java.util.stream.IntStream.of;

interface Kata {
  static int sum(int[] numbers) {
    return numbers == null ? 0 : of(numbers).boxed().sorted(reverseOrder()).skip(1).sorted().skip(1).mapToInt(Integer::intValue).sum();
  }
}
