import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, Solution.maxGap(new int[]{13, 10, 2, 9, 5}));
    assertEquals(8, Solution.maxGap(new int[]{13, 3, 5}));
    assertEquals(23, Solution.maxGap(new int[]{-3, -27, -4, -2}));
    assertEquals(168, Solution.maxGap(new int[]{24, 299, 131, 14, 26, 25}));
    assertEquals(767, Solution.maxGap(new int[]{-7, -42, -809, -14, -12}));
    assertEquals(278, Solution.maxGap(new int[]{12, -5, -7, 0, 290}));
    assertEquals(576, Solution.maxGap(new int[]{-54, 37, 0, 64, -15, 640, 0}));
  }
}
