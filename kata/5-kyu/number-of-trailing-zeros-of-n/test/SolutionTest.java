import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Solution.zeros(0));
    assertEquals(1, Solution.zeros(6));
    assertEquals(2, Solution.zeros(14));
    assertEquals(7, Solution.zeros(30));
    assertEquals(13100198, Solution.zeros(52400812));
    assertEquals(211650847, Solution.zeros(846603410));
  }
}