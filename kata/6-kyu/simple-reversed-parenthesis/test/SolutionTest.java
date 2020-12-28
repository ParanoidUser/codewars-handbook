import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(2, Solution.solve(")()("));
    assertEquals(1, Solution.solve("((()"));
    assertEquals(-1, Solution.solve("((("));
    assertEquals(3, Solution.solve("())((("));
    assertEquals(4, Solution.solve("())()))))()()("));
  }
}