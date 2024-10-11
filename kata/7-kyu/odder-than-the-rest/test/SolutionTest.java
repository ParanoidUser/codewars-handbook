import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, Solution.oddOne(new int[]{2, 4, 6, 7, 10}));
    assertEquals(4, Solution.oddOne(new int[]{2, 16, 98, 10, 13, 78}));
    assertEquals(4, Solution.oddOne(new int[]{4, -8, 98, -12, -7, 90, 100}));
    assertEquals(-1, Solution.oddOne(new int[]{2, 4, 6, 8}));
  }
}