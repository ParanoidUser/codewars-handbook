import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[] {1, 3, 4, 2, 5, 7, 6}, new Solution().splitByValue(5, new int[] {1, 3, 5, 7, 6, 4, 2}));
    assertArrayEquals(new int[] {5, 2, 7, 3, 2}, new Solution().splitByValue(0, new int[] {5, 2, 7, 3, 2}));
    assertArrayEquals(new int[] {4, 6, 10, 10, 6}, new Solution().splitByValue(6, new int[] {6, 4, 10, 10, 6}));
  }
}
