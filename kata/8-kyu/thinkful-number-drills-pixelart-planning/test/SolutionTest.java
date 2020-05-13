import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.isDivisible(4050, 27));
    assertTrue(Kata.isDivisible(10000, 20));
    assertTrue(Kata.isDivisible(10005, 1));
    assertFalse(Kata.isDivisible(4066, 27));
    assertFalse(Kata.isDivisible(10005, 2));
  }
}
