import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("thin", Solution.thinOrFat(new int[][]{{1, 3}, {5, 7}}));
    assertEquals("fat", Solution.thinOrFat(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}));
    assertEquals("perfect", Solution.thinOrFat(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    assertNull(Solution.thinOrFat(new int[][]{{-1, 1, 1}, {-1, 1, 1}, {1, 1, 1}}));
  }
}