import static java.util.stream.Collectors.joining;

interface WhereIsMyParent {
  static String findChildren(String text) {
    return text.chars()
        .mapToObj(c -> (char) c + "")
        .sorted(String.CASE_INSENSITIVE_ORDER.thenComparing(c -> c))
        .collect(joining());
  }
}
