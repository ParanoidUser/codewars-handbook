import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{{1, 3}, {2, 4}}, Kata.twosDifference(new int[]{1, 2, 3, 4}));
    assertArrayEquals(new int[][]{{1, 3}, {4, 6}}, Kata.twosDifference(new int[]{1, 3, 4, 6}));
  }
}