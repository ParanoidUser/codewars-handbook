import static java.util.stream.Collectors.joining;

interface Kata {
  static String rot13(String str) {
    return str.chars().mapToObj(c -> "" + (char) c)
        .map(c -> "" + (char) (c.charAt(0) + (c.matches("(?i)[A-M]") ? 13 : c.matches("(?i)[N-Z]") ? -13 : 0)))
        .collect(joining());
  }
}