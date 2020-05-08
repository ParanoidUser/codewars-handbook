import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Solution.addFive(-5));
    assertEquals(5, Solution.addFive(0));
    assertEquals(10, Solution.addFive(5));
  }
}
