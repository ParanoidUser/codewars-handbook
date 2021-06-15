import static java.util.Map.Entry.comparingByKey;

import java.util.HashMap;
import java.util.Map.Entry;

interface Rank {
  static String nthRank(String st, Integer[] we, int n) {
    if (st.isEmpty()) {
      return "No participants";
    }

    var names = st.split(",");
    HashMap<String, Integer> map = new HashMap<>();
    for (var i = 0; names.length >= n && i < names.length; i++) {
      we[i] *= names[i].toUpperCase().chars().map(c -> c - 64).sum() + names[i].length();
      map.put(names[i], we[i]);
    }

    if (map.isEmpty()) {
      return "Not enough participants";
    }

    return map.entrySet().stream()
              .sorted(Entry.<String, Integer>comparingByValue().reversed().thenComparing(comparingByKey()))
              .map(Entry::getKey)
              .toArray(String[]::new)[n - 1];
  }
}
