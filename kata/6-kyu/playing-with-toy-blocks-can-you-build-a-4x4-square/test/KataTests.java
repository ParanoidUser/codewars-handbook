import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertTrue(Kata.buildSquare(new int[]{4, 3, 2, 1, 3, 1, 1, 2, 3, 1, 1}));
    assertTrue(Kata.buildSquare(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    assertFalse(Kata.buildSquare(new int[]{3, 1, 3, 1, 3, 1, 3, 2}));
    assertFalse(Kata.buildSquare(new int[]{3, 2, 3, 3, 3, 3, 3, 3, 4, 2, 4}));
    assertFalse(Kata.buildSquare(new int[]{1, 3, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1}));
  }
}