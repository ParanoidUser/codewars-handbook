import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{2, 2}, Solution.trouble(new int[]{2, 6, 2}, 8));
    assertArrayEquals(new int[]{2}, Solution.trouble(new int[]{2, 2, 2, 2, 2, 2}, 4));
    assertArrayEquals(new int[]{4, 1, 4}, Solution.trouble(new int[]{4, 1, 1, 1, 4}, 2));
    assertArrayEquals(new int[]{1, 3, 5, 6, 7, 4}, Solution.trouble(new int[]{1, 3, 5, 6, 7, 4, 3}, 7));
  }
}