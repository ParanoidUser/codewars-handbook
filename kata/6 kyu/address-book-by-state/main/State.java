import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toCollection;

import java.util.*;
import java.util.Map.Entry;

class State {
  static String byState(String str) {
    var states = Map.of(
            "AZ", "Arizona",
            "CA", "California",
            "ID", "Idaho",
            "IN", "Indiana",
            "MA", "Massachusetts",
            "OK", "Oklahoma",
            "PA", "Pennsylvania",
            "VA", "Virginia");

    Map<String, Set<String>> map = str.lines().collect(groupingBy(s -> states.get(s.substring(s.length() - 2)), TreeMap::new, toCollection(TreeSet::new)));

    List<String> res = new ArrayList<>();
    for (Entry<String, Set<String>> entry : map.entrySet()) {
      res.add((res.isEmpty() ? "" : " ") + entry.getKey());
      for (String friend : entry.getValue()) {
        res.add("..... " + friend.substring(0, friend.length() - 2).replace(",", "") + entry.getKey());
      }
    }

    return String.join("\n", res);
  }
}
