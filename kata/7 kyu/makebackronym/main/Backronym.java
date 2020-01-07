import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

import java.util.Map;

class Backronym {
  private static Map<String, String> dictionary = Preload.dictionary;

  static String makeBackronym(String acronym) {
    return acronym.isBlank() ? "" : of(acronym.toUpperCase().split("")).map(dictionary::get).collect(joining(" "));
  }
}
