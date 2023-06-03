import static java.time.Duration.between;
import static java.time.Instant.now;
import static java.util.Comparator.comparing;

import java.util.List;

interface Solution {
  static List<Item> solve(List<Item> input) {
    return input.stream()
        .filter(i -> "Red".equals(i.color) && between(i.created, now()).toDays() < 7)
        .sorted(comparing(i -> i.category.name()))
        .toList();
  }
}