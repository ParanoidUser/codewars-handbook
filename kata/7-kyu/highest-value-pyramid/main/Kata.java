import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.IntStream.of;

import java.util.Map.Entry;
import java.util.OptionalInt;

interface Kata {
  static OptionalInt pyramid(int[] stones) {
    var stoneCount = of(stones).boxed().collect(groupingBy(s -> s, counting()));
    int total = 0;
    for (int high = 3; high > 0; high--) {
      final int layer = high;
      var value = stoneCount.entrySet().stream().filter(e -> e.getValue() >= layer)
          .max(comparingInt(Entry::getKey)).map(Entry::getKey).orElse(Integer.MIN_VALUE);

      if (value == Integer.MIN_VALUE) {
        return OptionalInt.empty();
      }
      total += layer * value;
      stoneCount.remove(value);
    }
    return OptionalInt.of(total);
  }
}