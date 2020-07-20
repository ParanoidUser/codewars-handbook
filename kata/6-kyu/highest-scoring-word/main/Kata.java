import static java.util.Comparator.comparingInt;
import static java.util.stream.Stream.of;

interface Kata {
  static String high(String s) {
    return of(s.split(" ")).max(comparingInt(w -> w.chars().map(i -> i - 96).sum())).orElse("");
  }
}
