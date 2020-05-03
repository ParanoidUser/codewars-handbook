import static java.util.stream.IntStream.iterate;

import java.util.LinkedList;
import java.util.List;

interface RangeMerger {
  static int[] merge(int[] ranges) {
    var merged = new LinkedList<Integer>();
    iterate(0, i -> i < ranges.length, i -> i + 2)
        .mapToObj(i -> new int[]{ranges[i], ranges[i + 1]})
        .sorted((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1])
        .forEach(range -> {
          if (merged.isEmpty() || merged.getLast() < range[0] - 1) {
            merged.addAll(List.of(range[0], range[1]));
          } else if (merged.getLast() < range[1]) {
            merged.set(merged.size() - 1, range[1]);
          }
        });
    return merged.stream().mapToInt(i -> i).toArray();
  }
}