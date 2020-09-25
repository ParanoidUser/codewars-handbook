import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3L, Solution.solve(3L));
    assertEquals(11L, Solution.solve(11L));
    assertEquals(3L, Solution.solve(4L));
    assertEquals(109L, Solution.solve(110L));
    assertEquals(1109L, Solution.solve(1110L));
    assertEquals(2999L, Solution.solve(3000L));
    assertEquals(34981L, Solution.solve(35000L));
    assertEquals(10000000019L, Solution.solve(10000000000L));
  }
}