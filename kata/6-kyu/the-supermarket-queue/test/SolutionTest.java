import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(9, Solution.solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2));
    assertEquals(0, Solution.solveSuperMarketQueue(new int[]{}, 1));
    assertEquals(15, Solution.solveSuperMarketQueue(new int[]{1, 2, 3, 4, 5}, 1));
  }
}
