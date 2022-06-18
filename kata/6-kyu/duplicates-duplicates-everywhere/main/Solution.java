import static java.util.stream.Collectors.toMap;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

interface Solution {
  static Map<Integer, List<String>> removeDuplicateIds(Map<Integer, List<String>> obj) {
    var seen = new HashSet<>();
    return obj.entrySet().stream()
        .sorted(Entry.<Integer, List<String>>comparingByKey().reversed())
        .collect(toMap(Entry::getKey, e -> e.getValue().stream().filter(seen::add).toList()));
  }
}