import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(8, MaxSumBetweenTwoNegatives.maxSum(new int[]{-1, 6, -2, 3, 5, -7}));
    assertEquals(0, MaxSumBetweenTwoNegatives.maxSum(new int[]{5, -1, -2}));
    assertEquals(-1, MaxSumBetweenTwoNegatives.maxSum(new int[]{1, -2}));
  }
}