import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.IntStream.of;

interface Kata {
  static int mostFrequentItemCount(int[] collection) {
    return of(collection).boxed().collect(groupingBy(identity(), counting()))
                         .values().stream().mapToInt(Long::intValue).max().orElse(0);
  }
}
