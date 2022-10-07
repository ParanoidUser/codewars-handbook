import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.game(new int[]{2, 5, 6, 9}, new int[]{1, 3, 4, 11}, new int[]{0, 7, 8, 10}));
    assertTrue(Kata.game(new int[]{0, 1, 7, 9}, new int[]{2, 3, 5, 6}, new int[]{4, 8, 10, 11}));
    assertFalse(Kata.game(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{0, 9, 10, 11}));
    assertFalse(Kata.game(new int[]{2, 4, 6, 8}, new int[]{0, 1, 3, 5}, new int[]{7, 9, 10, 11}));
    assertFalse(Kata.game(new int[]{0, 2, 4, 6}, new int[]{3, 5, 9, 10}, new int[]{1, 7, 8, 11}));
    assertFalse(Kata.game(new int[]{0, 2, 7, 8}, new int[]{6, 9, 10, 11}, new int[]{1, 3, 4, 5}));
    assertFalse(Kata.game(new int[]{1, 3, 6, 10}, new int[]{0, 2, 4, 5}, new int[]{7, 8, 9, 11}));
    assertFalse(Kata.game(new int[]{0, 3, 4, 9}, new int[]{5, 7, 8, 11}, new int[]{1, 2, 6, 10}));
  }
}