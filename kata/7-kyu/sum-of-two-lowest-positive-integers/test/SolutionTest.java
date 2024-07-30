import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(13L, Kata.sumTwoSmallestNumbers(new long[]{5, 8, 12, 19, 22}));
    assertEquals(6L, Kata.sumTwoSmallestNumbers(new long[]{15, 28, 4, 2, 43}));
    assertEquals(6L, Kata.sumTwoSmallestNumbers(new long[]{3, 87, 3, 12, 7}));
    assertEquals(24L, Kata.sumTwoSmallestNumbers(new long[]{23, 71, 33, 82, 1}));
    assertEquals(16L, Kata.sumTwoSmallestNumbers(new long[]{52, 76, 14, 12, 4}));
  }
}