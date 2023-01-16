import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(9, Kata.squareSum(new int[]{1, 2, 2}));
    assertEquals(5, Kata.squareSum(new int[]{1, 2}));
    assertEquals(50, Kata.squareSum(new int[]{5, -3, 4}));
  }
}