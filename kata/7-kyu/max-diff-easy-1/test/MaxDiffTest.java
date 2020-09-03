import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxDiffTest {
  @Test
  void sample() {
    assertEquals(4, Kata.maxDiff(new int[]{1, 2, 3, 4, 5, 5, 4}));
    assertEquals(30, Kata.maxDiff(new int[]{-4, -5, -3, -1, -31}));
    assertEquals(10, Kata.maxDiff(new int[]{1, 2, 3, 4, -5, 5, 4}));
    assertEquals(0, Kata.maxDiff(new int[]{1000000}));
    assertEquals(0, Kata.maxDiff(new int[]{}));
  }
}
