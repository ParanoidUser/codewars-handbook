import static java.util.concurrent.ThreadLocalRandom.current;
import static java.util.stream.IntStream.rangeClosed;
import static java.util.stream.Stream.of;

class BingoCard {
  static int[][] scheme = {
    {'B', 1, 15, 5},
    {'I', 16, 30, 5},
    {'N', 31, 45, 4},
    {'G', 46, 60, 5},
    {'O', 61, 75, 5}
  };

  static String[] getCard() {
    return of(scheme).flatMap(s -> rangeClosed(s[1], s[2]).boxed().sorted((a, b) -> current().nextInt(-1, 2)).limit(s[3]).map(i -> (char) s[0] + "" + i)).toArray(String[]::new);
  }
}
