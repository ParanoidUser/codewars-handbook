import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Solution.solve(new int[0][]));
    assertEquals(8, Solution.solve(new int[][]{{1, 2}, {3, 4}}));
    assertEquals(45, Solution.solve(new int[][]{{10, -15}, {-1, -3}}));
    assertEquals(12, Solution.solve(new int[][]{{-3, -4}, {1, 2, -3}}));
    assertEquals(12, Solution.solve(new int[][]{{-1, 2, -3, 4}, {1, -2, 3, -4}}));
    assertEquals(3584, Solution.solve(new int[][]{{14, 2}, {0, -16}, {-12, -16}}));
    assertEquals(17600, Solution.solve(new int[][]{{-11, -6}, {-20, -20}, {18, -4}, {-20, 1}}));
    assertEquals(21384, Solution.solve(new int[][]{{-11, 11, -18, 5}, {-11, 5}, {6, 18}, {6, -9}}));
    assertEquals(-40, Solution.solve(new int[][]{{-2, -15, -12, -8, -16}, {-4, -15, -7}, {-10, -5}}));
    assertEquals(2448, Solution.solve(new int[][]{{-2, 5, -17, -5, -8}, {-1, 16, 10, -14}, {-1, 5, -5, -9, 10}}));
  }
}