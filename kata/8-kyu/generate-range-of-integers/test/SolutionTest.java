import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1}, Solution.generateRange(1, 15, 20));
    assertArrayEquals(new int[]{2, 4, 6, 8, 10}, Solution.generateRange(2, 10, 2));
    assertArrayEquals(new int[]{-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1}, Solution.generateRange(-10, 1, 1));
  }
}