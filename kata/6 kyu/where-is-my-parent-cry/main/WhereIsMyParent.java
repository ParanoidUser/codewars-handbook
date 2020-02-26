import static java.util.stream.Collectors.joining;

class WhereIsMyParent {
  static String findChildren(String text) {
    return text.chars()
        .mapToObj(c -> (char) c + "")
        .sorted(String.CASE_INSENSITIVE_ORDER.thenComparing(c -> c))
        .collect(joining());
  }
}
