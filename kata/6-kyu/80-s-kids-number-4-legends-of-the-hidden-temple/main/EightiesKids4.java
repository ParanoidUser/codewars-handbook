import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface EightiesKids4 {
  static String markSpot(float n) {
    return n > 0 && n % 2 > 0 && n % (int) n == 0 ? range(0, (int) n)
        .map(i -> 2 * (i < n / 2 ? (int) n - i : i + 1))
        .mapToObj(i -> new StringBuilder(" ".repeat(i))
            .replace((int) n * 2 - i, (int) n * 2 - i + 1, "X")
            .replace(i - 2, i - 1, "X")
            .replace(i - 1, i, "\n")
            .toString()).collect(joining()) : "?";
  }
}