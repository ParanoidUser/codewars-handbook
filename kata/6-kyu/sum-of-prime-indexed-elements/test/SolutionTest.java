import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Solution.solve(new int[0]));
    assertEquals(7, Solution.solve(new int[]{1, 2, 3, 4}));
    assertEquals(13, Solution.solve(new int[]{1, 2, 3, 4, 5, 6}));
    assertEquals(47, Solution.solve(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
  }
}