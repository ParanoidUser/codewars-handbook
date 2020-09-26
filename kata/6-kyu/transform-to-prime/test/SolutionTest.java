import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Solution.minimumNumber(new int[]{3, 1, 2}));
    assertEquals(0, Solution.minimumNumber(new int[]{5, 2}));
    assertEquals(0, Solution.minimumNumber(new int[]{1, 1, 1}));
    assertEquals(5, Solution.minimumNumber(new int[]{2, 12, 8, 4, 6}));
    assertEquals(2, Solution.minimumNumber(new int[]{50, 39, 49, 6, 17, 28}));
  }
}
