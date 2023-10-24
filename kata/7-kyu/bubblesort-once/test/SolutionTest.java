import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{7, 5, 3, 1, 2, 4, 6, 8, 9}, BubblesortOnce.bubbleSortOnce(new int[]{9, 7, 5, 3, 1, 2, 4, 6, 8}));
  }
}