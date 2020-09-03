import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.isNice(new Integer[]{1, 2, 3, 4, 5}));
    assertTrue(Kata.isNice(new Integer[]{5, 4, 3, 2, 1}));
    assertFalse(Kata.isNice(new Integer[]{1, 3, 5, 2}));
    assertFalse(Kata.isNice(new Integer[]{10, 10, 2, 2, 3}));
    assertFalse(Kata.isNice(new Integer[0]));
    assertFalse(Kata.isNice(new Integer[]{1}));
  }
}
