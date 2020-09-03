import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.IntStream.of;

interface Solution {
  static int duplicates(int[] array) {
    return of(array).boxed().collect(groupingBy(identity(), counting())).values()
                    .stream().mapToInt(i -> i.intValue() / 2).sum();
  }
}
