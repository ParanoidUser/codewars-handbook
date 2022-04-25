import static java.util.stream.IntStream.rangeClosed;
import static java.util.stream.Stream.of;

import java.security.SecureRandom;

final class BingoCard {
  private static final int[][] SCHEME = {
      {'B', 1, 15, 5},
      {'I', 16, 30, 5},
      {'N', 31, 45, 4},
      {'G', 46, 60, 5},
      {'O', 61, 75, 5}
  };

  static String[] getCard() {
    return of(SCHEME).flatMap(s -> rangeClosed(s[1], s[2]).boxed().sorted((a, b) -> new SecureRandom().nextInt(-1, 2)).limit(s[3])
        .map(i -> (char) s[0] + "" + i)).toArray(String[]::new);
  }

  private BingoCard() {}
}
