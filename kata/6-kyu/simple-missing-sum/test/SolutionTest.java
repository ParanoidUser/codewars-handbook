import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, Solution.solve(new int[]{1, 2, 8, 7}));
    assertEquals(7, Solution.solve(new int[]{2, 12, 3, 1}));
    assertEquals(19, Solution.solve(new int[]{4, 2, 8, 3, 1}));
    assertEquals(1, Solution.solve(new int[]{4, 2, 12, 3}));
    assertEquals(8, Solution.solve(new int[]{1, 2, 4}));
  }
}