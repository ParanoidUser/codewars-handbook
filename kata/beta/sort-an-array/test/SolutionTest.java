import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{-6, -2, 0, 1, 5, 6, 47}, SortArray.sortArray(new int[]{-2, 1, 0, 47, 5, 6, -6}));
  }
}
