import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static String pattern(int n) {
    return rangeClosed(1, n).mapToObj(i -> "1" + "*".repeat(i - 1) + (i > 1 ? i : "")).collect(joining("\n"));
  }
}