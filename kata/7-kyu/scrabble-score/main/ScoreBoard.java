import static java.util.Map.entry;

import java.util.Map;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ScoreBoard {

  private static final Map<Character, Integer> SCORE = Map.ofEntries(
      entry('E', 1),
      entry('A', 1),
      entry('I', 1),
      entry('O', 1),
      entry('N', 1),
      entry('R', 1),
      entry('T', 1),
      entry('L', 1),
      entry('S', 1),
      entry('U', 1),
      entry('D', 2),
      entry('G', 2),
      entry('B', 3),
      entry('C', 3),
      entry('M', 3),
      entry('P', 3),
      entry('F', 4),
      entry('H', 4),
      entry('V', 4),
      entry('W', 4),
      entry('Y', 4),
      entry('K', 5),
      entry('J', 8),
      entry('X', 8),
      entry('Q', 10),
      entry('Z', 10)
  );

  public static int getScore(char c) {
    return SCORE.get(c);
  }
}