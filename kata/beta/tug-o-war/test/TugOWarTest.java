import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TugOWarTest {
  @Test
  void winByPoints() {
    assertEquals("Team 1 wins!", TugOWar.tugOWar(new int[][]{{1, 2, 3, 4, 6}, {5, 4, 3, 2, 1}}));
    assertEquals("Team 2 wins!", TugOWar.tugOWar(new int[][]{{1, 2, 3, 4, 5}, {6, 4, 3, 2, 1}}));
  }

  @Test
  void winByAnchor() {
    assertEquals("Team 1 wins!", TugOWar.tugOWar(new int[][]{{4, 3, 2, 1}, {2, 2, 2, 2, 2}}));
    assertEquals("Team 2 wins!", TugOWar.tugOWar(new int[][]{{1, 2, 3, 4, 6}, {5, 4, 3, 2, 2}}));
  }

  @Test
  void tieCase() {
    assertEquals("It's a tie!", TugOWar.tugOWar(new int[][]{{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}}));
    assertEquals("It's a tie!", TugOWar.tugOWar(new int[][]{{5, 3, 3, 3, 1}, {1, 2, 3, 4, 5}}));
  }
}