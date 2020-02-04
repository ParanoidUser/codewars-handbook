import static java.util.stream.Collectors.joining;

class DuplicateEncoder {
  static String encode(String word) {
    return word.toLowerCase()
        .chars()
        .mapToObj(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
        .collect(joining());
  }
}
