import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void defaultTest() {
    BullsAndCows bac = new BullsAndCows(7536);
    assertEquals("1 bull and 0 cows", bac.compareWith(1234));
    assertEquals("0 bulls and 2 cows", bac.compareWith(5601));
    assertEquals("0 bulls and 3 cows", bac.compareWith(6750));
    assertEquals("0 bulls and 4 cows", bac.compareWith(6357));
    assertEquals("1 bull and 0 cows", bac.compareWith(7014));
    assertEquals("1 bull and 1 cow", bac.compareWith(6508));
    assertEquals("0 bulls and 0 cows", bac.compareWith(4289));
    assertEquals("You win!", bac.compareWith(7536));
  }

  @Test
  void invalidNumbers() {
    BullsAndCows bac = new BullsAndCows(1234);
    assertThrows(IllegalArgumentException.class, () -> bac.compareWith(10000));
    assertThrows(IllegalArgumentException.class, () -> bac.compareWith(999));
    assertThrows(IllegalArgumentException.class, () -> bac.compareWith(17245));
    assertThrows(IllegalArgumentException.class, () -> bac.compareWith(9855));
    assertThrows(IllegalArgumentException.class, () -> bac.compareWith(-190));
    assertThrows(IllegalArgumentException.class, () -> bac.compareWith(7));
  }

  @Test
  void invalidTurnsShouldNotBeCounted() {
    BullsAndCows bac = new BullsAndCows(1234);
    for (int i = 0; i < 8; i++) {
      assertThrows(IllegalArgumentException.class, () -> bac.compareWith(11111));
    }
    for (int i = 0; i < 8; i++) {
      assertEquals("0 bulls and 0 cows", bac.compareWith(5678));
    }
  }

  @Test
  void outOfTurns() {
    BullsAndCows bac = new BullsAndCows(1234);
    for (int i = 0; i < 8; i++) {
      assertEquals("1 bull and 1 cow", bac.compareWith(2035));
    }
    for (int i = 0; i < 8; i++) {
      assertEquals("Sorry, you're out of turns!", bac.compareWith(1234));
    }
    assertEquals("Sorry, you're out of turns!", bac.compareWith(1111));
  }

  @Test
  void gameWon() {
    BullsAndCows bac = new BullsAndCows(1234);
    assertEquals("You win!", bac.compareWith(1234));
    assertEquals("You already won!", bac.compareWith(1234));
    for (int i = 0; i < 10; i++) {
      assertEquals("You already won!", bac.compareWith(5678));
    }
    assertEquals("You already won!", bac.compareWith(1111));
  }
}