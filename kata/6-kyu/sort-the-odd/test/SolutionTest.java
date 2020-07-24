import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, Kata.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
    assertArrayEquals(new int[]{1, 3, 5, 8, 0}, Kata.sortArray(new int[]{5, 3, 1, 8, 0}));
    assertArrayEquals(new int[]{1, 8, 3, 6, 5, 4, 7, 2, 9, 0}, Kata.sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    assertArrayEquals(new int[]{1, 3, 5, 7, 9, 0, 2, 4, 6, 8}, Kata.sortArray(new int[]{9, 7, 5, 3, 1, 0, 2, 4, 6, 8}));
    assertArrayEquals(new int[]{1, 3, 5, 7, 9, 0, 2, 4, 6, 8}, Kata.sortArray(new int[]{1, 3, 5, 7, 9, 0, 2, 4, 6, 8}));
    assertArrayEquals(new int[]{0, 2, 4, 6, 8, 1, 3, 5, 7, 9}, Kata.sortArray(new int[]{0, 2, 4, 6, 8, 1, 3, 5, 7, 9}));
    assertArrayEquals(new int[]{}, Kata.sortArray(new int[]{}));
  }
}
