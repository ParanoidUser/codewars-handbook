import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

interface Carboat {
  static String howmuch(int m, int n) {
    return "[" + rangeClosed(Math.min(m, n), Math.max(m, n))
            .filter(i -> i % 7 == 2 && i % 9 == 1)
            .mapToObj(i -> "[M: " + i + " B: " + i / 7 + " C: " + i / 9 + "]")
            .collect(joining()) + "]";
  }
}
