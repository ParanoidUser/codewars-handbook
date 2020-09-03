import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

class JadenCase {
  String toJadenCase(String phrase) {
    return phrase == null || phrase.isBlank() ? null :
           stream(phrase.split(" ")).map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).collect(joining(" "));
  }
}
