import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface JavaUnicodeEncoder {
  static String encode(String input) {
    return input.chars().mapToObj(c -> String.format("\\u%04x", c)).collect(joining());
  }

  static String decode(String input) {
    return of(input.split("\\\\u")).filter(u -> !u.isEmpty()).map(u -> (char) Integer.parseInt(u, 16) + "").collect(joining());
  }
}