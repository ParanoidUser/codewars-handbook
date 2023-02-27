import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, Solution.duplicates(new int[]{1, 2, 2, 20, 6, 20, 2, 6, 2}));
    assertEquals(3, Solution.duplicates(new int[]{0, 0, 0, 0, 0, 0, 0}));
    assertEquals(2, Solution.duplicates(new int[]{1, 2, 5, 6, 5, 2}));
    assertEquals(1, Solution.duplicates(new int[]{1000, 1000}));
    assertEquals(0, Solution.duplicates(new int[]{54}));
    assertEquals(0, Solution.duplicates(new int[]{}));
  }
}