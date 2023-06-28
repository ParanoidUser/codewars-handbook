import java.util.List;
import java.util.Map.Entry;

import static java.util.Collections.reverseOrder;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Stream.of;

interface TopWords {
  static List<String> top3(String s) {
    return of(s.toLowerCase().split("[^a-z*|']"))
            .filter(w -> !w.replace("'", "").isEmpty())
            .collect(groupingBy(w -> w, counting())).entrySet().stream()
            .sorted(reverseOrder(Entry.comparingByValue()))
            .map(Entry::getKey).limit(3).toList();
  }
}