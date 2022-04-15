import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{2}, Kata.arrayDiff(new int[]{1, 2}, new int[]{1}));
    assertArrayEquals(new int[]{2, 2}, Kata.arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
    assertArrayEquals(new int[]{1}, Kata.arrayDiff(new int[]{1, 2, 2}, new int[]{2}));
    assertArrayEquals(new int[]{1, 2, 2}, Kata.arrayDiff(new int[]{1, 2, 2}, new int[]{}));
    assertArrayEquals(new int[]{}, Kata.arrayDiff(new int[]{}, new int[]{1, 2}));
  }
}