import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, Solution.solve(new int[]{1, -1, 2, -2, 3}));
    assertEquals(-4, Solution.solve(new int[]{-3, 1, 2, 3, -1, -4, -2}));
    assertEquals(3, Solution.solve(new int[]{1, -1, 2, -2, 3, 3}));
    assertEquals(-38, Solution.solve(new int[]{-110, 110, -38, -38, -62, 62, -38, -38, -38}));
    assertEquals(-9, Solution.solve(new int[]{-9, -105, -9, -9, -9, -9, 105}));
  }
}