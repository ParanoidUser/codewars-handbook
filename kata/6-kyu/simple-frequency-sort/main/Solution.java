import static java.util.Comparator.naturalOrder;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.IntStream.of;

import java.util.Comparator;

interface Solution {
  static int[] sortByFrequency(int[] array) {
    var stats = of(array).boxed().collect(groupingBy(identity(), counting()));
    return of(array).boxed().sorted(Comparator.<Integer, Long>comparing(stats::get).reversed()
        .thenComparing(naturalOrder())).mapToInt(i -> i).toArray();
  }
}