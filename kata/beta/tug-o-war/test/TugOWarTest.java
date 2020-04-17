import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TugOWarTest {
  @Test
  void testTugOWar() {
    assertEquals("Team 1 wins!", TugOWar.tugOWar(new int[][]{{1, 2, 3, 4, 6}, {5, 4, 3, 2, 1}}));
    assertEquals("Team 2 wins!", TugOWar.tugOWar(new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}}));
    assertEquals("It's a tie!", TugOWar.tugOWar(new int[][]{{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}}));
  }
}