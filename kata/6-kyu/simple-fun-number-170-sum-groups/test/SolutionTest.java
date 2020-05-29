import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(6, Solution.sumGroups(new int[]{2, 1, 2, 2, 6, 5, 0, 2, 0, 5, 5, 7, 7, 4, 3, 3, 9}));
    assertEquals(5, Solution.sumGroups(new int[]{2, 1, 2, 2, 6, 5, 0, 2, 0, 3, 3, 3, 9, 2}));
    assertEquals(1, Solution.sumGroups(new int[]{1, 1, 2, 2}));
    assertEquals(2, Solution.sumGroups(new int[]{1, 2}));
    assertEquals(1, Solution.sumGroups(new int[]{2}));
  }
}