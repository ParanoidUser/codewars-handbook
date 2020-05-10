import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Kata.mergeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
    assertArrayEquals(new int[]{2, 4, 6, 8}, Kata.mergeArrays(new int[]{2, 4, 8}, new int[]{2, 4, 6}));
  }
}
