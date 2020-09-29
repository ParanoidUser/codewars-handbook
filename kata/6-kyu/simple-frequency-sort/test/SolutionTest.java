import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{3, 3, 3, 5, 5, 7, 7, 2, 9}, Solution.sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7}));
    assertArrayEquals(new int[]{9, 9, 9, 9, 4, 4, 5, 5, 6, 6}, Solution.sortByFrequency(new int[]{5, 9, 6, 9, 6, 5, 9, 9, 4, 4}));
    assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 8}, Solution.sortByFrequency(new int[]{4, 4, 2, 5, 1, 1, 3, 3, 2, 8}));
    assertArrayEquals(new int[]{0, 0, 4, 4, 9, 9, 3, 5, 7, 8}, Solution.sortByFrequency(new int[]{4, 9, 5, 0, 7, 3, 8, 4, 9, 0}));
    assertArrayEquals(new int[]{1, 1, 1, 0, 0, 6, 6, 8, 8, 2, 3, 5, 9}, Solution.sortByFrequency(new int[]{1, 2, 3, 0, 5, 0, 1, 6, 8, 8, 6, 9, 1}));
  }
}
