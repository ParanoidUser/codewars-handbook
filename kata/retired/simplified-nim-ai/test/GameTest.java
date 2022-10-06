import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
  private Game game;

  @BeforeEach
  void setUp() {
    game = new Game();
  }

  @Test
  void alwaysOne() {
    assertEquals(3, runGame(1));
  }

  @Test
  void alwaysTwo() {
    assertEquals(2, runGame(2));
  }

  @Test
  void alwaysThree() {
    assertEquals(1, runGame(3));
  }

  @Test
  void badInputTooLow() {
    assertThrows(Exception.class, () -> game.turn(0));
  }

  @Test
  void badInputTooHigh() {
    assertThrows(Exception.class, () -> game.turn(4));
  }

  @Test
  void badAIMoveTooLow() {
    assertFalse(game.turn(1) < 1);
  }

  @Test
  void badAIMoveTooHigh() {
    assertFalse(game.turn(1) > 3);
  }

  @Test
  void badGameIsOver() {
    assertEquals(1, runGame(3));
    assertThrows(Exception.class, () -> game.turn(1));
  }

  private int runGame(int n) {
    int lastPick = 0;
    for (int coins = 12; coins > 0; coins -= (n + lastPick)) {
      lastPick = game.turn(n);
    }
    return lastPick;
  }
}
