import static java.util.function.Predicate.not;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface Kata {
  static String formatWords(String[] words) {
    return words == null ? "" : of(words).filter(not(String::isBlank)).collect(joining(", ")).replaceAll(",(?!.*,)", " and");
  }
}
