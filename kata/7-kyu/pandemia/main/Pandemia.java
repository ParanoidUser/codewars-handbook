import static java.util.stream.Stream.of;
import static java.util.stream.Collectors.joining;

interface Pandemia {
  static double infected(String s) {
    return s.replace("X", "").isEmpty() ? 0
        : 100. * of(s.split("X")).filter(c -> c.contains("1")).collect(joining()).length() / s.replace("X", "").length();
  }
}