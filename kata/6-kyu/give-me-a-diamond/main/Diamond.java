import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.iterate;

interface Diamond {
  static String print(int n) {
    if (n < 1 || n % 2 == 0) return null;
    return iterate(1, i -> i < 2 * n, i -> i + 2)
        .map(i -> i > n ? 2 * n - i : i)
        .mapToObj(i -> " ".repeat((n - i) / 2) + "*".repeat(i) + "\n")
        .collect(joining());
  }
}
