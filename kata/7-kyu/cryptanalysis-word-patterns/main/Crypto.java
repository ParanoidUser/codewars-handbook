import static java.util.stream.Collectors.joining;

import java.util.HashMap;

interface Crypto {
  static String wordPattern(String word) {
    var map = new HashMap<>();
    return word.toLowerCase().chars().mapToObj(c -> map.computeIfAbsent(c, k -> map.size()) + "").collect(joining("."));
  }
}