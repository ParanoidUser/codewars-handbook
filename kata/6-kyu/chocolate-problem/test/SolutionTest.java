import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Solution.chocolate(2, new int[]{1, 2}, new int[]{2, 1}));
    assertEquals(1, Solution.chocolate(3, new int[]{3, 1, 2}, new int[]{2, 3, 1}));
    assertEquals(2, Solution.chocolate(3, new int[]{1, 3, 2}, new int[]{1, 2, 3}));
    assertEquals(2, Solution.chocolate(3, new int[]{1, 2, 3}, new int[]{3, 2, 1}));
    assertEquals(1, Solution.chocolate(4, new int[]{4, 3, 2, 1}, new int[]{2, 1, 4, 3}));
    assertEquals(3, Solution.chocolate(5, new int[]{4, 3, 2, 5, 1}, new int[]{1, 2, 5, 3, 4}));
    assertEquals(2, Solution.chocolate(5, new int[]{3, 5, 2, 1, 4}, new int[]{4, 5, 2, 1, 3}));
    assertEquals(1, Solution.chocolate(6, new int[]{3, 6, 1, 5, 4, 2}, new int[]{1, 5, 4, 2, 3, 6}));
    assertEquals(5, Solution.chocolate(6, new int[]{3, 6, 1, 5, 4, 2}, new int[]{1, 4, 5, 3, 2, 6}));
  }
}
