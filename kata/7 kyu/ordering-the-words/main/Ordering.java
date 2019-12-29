import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

class Ordering {
  String orderWord(String s) {
    return s == null || s.isEmpty() ? "Invalid String!" : of(s.split("")).sorted().collect(joining());
  }
}
