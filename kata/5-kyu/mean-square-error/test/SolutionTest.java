import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(9.0, Solution.solution(new int[]{1, 2, 3}, new int[]{4, 5, 6}), 1e-15);
    assertEquals(16.5, Solution.solution(new int[]{10, 20, 10, 2}, new int[]{10, 25, 5, -2}), 1e-15);
    assertEquals(1.0, Solution.solution(new int[]{0, -1}, new int[]{-1, 0}), 1e-15);
    assertEquals(0.0, Solution.solution(new int[]{10, 10}, new int[]{10, 10}), 1e-15);
  }
}