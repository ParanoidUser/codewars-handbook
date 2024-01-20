import static java.util.stream.Collectors.joining;

interface Kata {
  static String ROT135(String input) {
    return input.chars().mapToObj(c -> "" + (char) c).map(s -> "" + (char) (s.charAt(0) + (
            s.matches("(?i)[A-M]") ? 13 : s.matches("(?i)[N-Z]") ? -13 :
            s.matches("[0-4]") ? 5 : s.matches("[5-9]") ? -5 : 0)))
        .collect(joining());
  }
}