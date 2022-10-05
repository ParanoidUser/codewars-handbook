import static java.util.stream.Collectors.joining;

interface MoveTen {
  static String moveTen(String s) {
    return s.chars().mapToObj(c -> (char) (c + (c < 'q' ? 10 : -16)) + "").collect(joining());
  }
}