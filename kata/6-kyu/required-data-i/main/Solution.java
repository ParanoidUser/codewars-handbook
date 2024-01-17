import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.IntStream.of;

import java.util.Map.Entry;

interface Solution {
  static Object[] countSel(int[] array) {
    var stats = of(array).boxed().collect(groupingBy(i -> i, counting()));
    int max = stats.values().stream().mapToInt(Long::intValue).max().orElseThrow();
    int[] occur = stats.entrySet().stream().filter(e -> e.getValue() == max).mapToInt(Entry::getKey).sorted().toArray();
    return new Object[]{
        array.length,
        stats.size(),
        (int) stats.entrySet().stream().filter(e -> e.getValue() == 1).count(),
        new Object[]{occur, max}
    };
  }
}