import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[0], Solution.largest(0, new int[]{7, 6, 8}));
    assertArrayEquals(new int[]{5}, Solution.largest(1, new int[]{1, 2, 3, 4, 5}));
    assertArrayEquals(new int[]{5, 6}, Solution.largest(2, new int[]{1, 2, 3, 4, 5, 6}));
    assertArrayEquals(new int[]{1, 1, 2}, Solution.largest(3, new int[]{1, 2, 1, 1}));
    assertArrayEquals(new int[]{4, 5, 6, 7}, Solution.largest(4, new int[]{3, 4, 5, 6, 7}));
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Solution.largest(5, new int[]{1, 2, 3, 4, 5}));
  }
}