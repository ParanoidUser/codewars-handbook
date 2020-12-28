import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Solution.solve(1));
    assertEquals(2, Solution.solve(2));
    assertEquals(9, Solution.solve(10));
    assertEquals(18, Solution.solve(18));
    assertEquals(48, Solution.solve(48));
    assertEquals(99, Solution.solve(100));
    assertEquals(99, Solution.solve(110));
    assertEquals(1999, Solution.solve(2090));
    assertEquals(999999999989L, Solution.solve(999999999992L));
  }
}