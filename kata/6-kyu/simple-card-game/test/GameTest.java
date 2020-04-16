import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test
  public void testGame() {
    assertEquals("Steve wins 2 to 1", Game.winner(new String[] {"A", "7", "8"}, new String[] {"K", "5", "9"}));
    assertEquals("Tie", Game.winner(new String[] {"T"}, new String[] {"T"}));
  }
}
