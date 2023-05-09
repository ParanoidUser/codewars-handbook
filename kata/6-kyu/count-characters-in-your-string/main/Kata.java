import java.util.Map;

import static java.util.stream.Collectors.toMap;

interface Kata {
  static Map<Character, Integer> count(String str) {
    return str.chars().mapToObj(c -> (char) c).collect(toMap(c -> c, c -> 1, Integer::sum));
  }
}