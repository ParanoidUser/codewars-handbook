import static java.util.Comparator.naturalOrder;
import static java.util.stream.Stream.of;

interface Kata {
  static String latestClock(int a, int b, int c, int d) {
    int[][] perms = {
        {a, b, c, d}, {a, b, d, c}, {a, c, b, d}, {a, c, d, b}, {a, d, b, c}, {a, d, c, b},
        {b, a, c, d}, {b, a, d, c}, {b, c, a, d}, {b, c, d, a}, {b, d, a, c}, {b, d, c, a},
        {c, b, a, d}, {c, b, d, a}, {c, a, b, d}, {c, a, d, b}, {c, d, b, a}, {c, d, a, b},
        {d, b, c, a}, {d, b, a, c}, {d, c, b, a}, {d, c, a, b}, {d, a, b, c}, {d, a, c, b}
    };
    return of(perms)
        .map(p -> (p[0] == 2 && p[1] < 4 || p[0] < 2) && p[2] < 6 ? "" + p[0] + p[1] + ":" + p[2] + p[3] : "")
        .max(naturalOrder()).orElseThrow();
  }
}