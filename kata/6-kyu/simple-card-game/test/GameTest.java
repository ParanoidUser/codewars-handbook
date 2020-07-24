import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GameTest {
  @Test
  void sample() {
    assertEquals("Steve wins 2 to 1", Game.winner(new String[] {"A", "7", "8"}, new String[] {"K", "5", "9"}));
    assertEquals("Josh wins 2 to 1", Game.winner(new String[] {"K", "5", "9"}, new String[] {"A", "7", "8"}));
    assertEquals("Tie", Game.winner(new String[] {"T"}, new String[] {"T"}));
  }
}
