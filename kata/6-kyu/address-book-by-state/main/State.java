import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toCollection;

import java.util.*;

interface State {
  static String byState(String str) {
    var states = Map.of("AZ", "Arizona", "CA", "California", "ID", "Idaho", "IN", "Indiana", "MA", "Massachusetts", "OK", "Oklahoma", "PA", "Pennsylvania", "VA", "Virginia");
    var res = new ArrayList<String>();
    for (var entry : str.lines().collect(groupingBy(s -> states.get(s.substring(s.length() - 2)), TreeMap::new, toCollection(TreeSet::new))).entrySet()) {
      res.add((res.isEmpty() ? "" : " ") + entry.getKey());
      for (String friend : entry.getValue()) {
        res.add("..... " + friend.substring(0, friend.length() - 2).replace(",", "") + entry.getKey());
      }
    }
    return String.join("\n", res);
  }
}
