import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.twoArePositive(2, 4, -3));
    assertTrue(Kata.twoArePositive(-4, 6, 8));
    assertTrue(Kata.twoArePositive(4, -6, 9));
    assertTrue(Kata.twoArePositive(4, 6, 0));
    assertFalse(Kata.twoArePositive(-4, 6, 0));
    assertFalse(Kata.twoArePositive(4, 6, 10));
    assertFalse(Kata.twoArePositive(-14, -3, -4));
  }
}