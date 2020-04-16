import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TugOWarTest {
  @Test
  void testTugOWar() {
    assertEquals(TugOWar.tugOWar(new int[][]{{1, 2, 3, 4, 6}, {5, 4, 3, 2, 1}}), "Team 1 wins!");
    assertEquals(TugOWar.tugOWar(new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}}), "Team 2 wins!");
    assertEquals(TugOWar.tugOWar(new int[][]{{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}}), "It's a tie!");
  }
}