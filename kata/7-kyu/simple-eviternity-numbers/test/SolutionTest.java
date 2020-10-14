import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, Solution.solve(1, 100));
    assertEquals(14, Solution.solve(1, 1000));
    assertEquals(37, Solution.solve(1, 10000));
    assertEquals(103, Solution.solve(1, 100000));
  }
}