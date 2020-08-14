import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{8, 9, 10, 11, 12, 13}, Kata.addingShifted(
        new int[][]{{1, 2, 3, 4, 5, 6}, {7, 7, 7, 7, 7, 7}}, 0));

    assertArrayEquals(new int[]{1, 2, 3, 11, 12, 13, 7, 7, 7}, Kata.addingShifted(
        new int[][]{{1, 2, 3, 4, 5, 6}, {7, 7, 7, 7, 7, 7}}, 3));

    assertArrayEquals(new int[]{1, 2, 3, 11, 12, 13, -6, 8, 8, 1, 1, 1}, Kata.addingShifted(
        new int[][]{{1, 2, 3, 4, 5, 6}, {7, 7, 7, -7, 7, 7}, {1, 1, 1, 1, 1, 1}}, 3));
  }
}
