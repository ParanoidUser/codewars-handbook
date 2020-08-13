import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(42, Kata.betweenExtremes(new int[]{21, 34, 54, 43, 26, 12}));
    assertEquals(99, Kata.betweenExtremes(new int[]{-1, -41, -77, -100}));
  }
}