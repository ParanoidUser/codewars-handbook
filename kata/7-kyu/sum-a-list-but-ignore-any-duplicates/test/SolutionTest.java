import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(6, Solution.sumNoDuplicates(new int[]{1, 2, 3}));
    assertEquals(5, Solution.sumNoDuplicates(new int[]{1, 1, 2, 3}));
    assertEquals(3, Solution.sumNoDuplicates(new int[]{1, 1, 2, 2, 3}));
  }
}