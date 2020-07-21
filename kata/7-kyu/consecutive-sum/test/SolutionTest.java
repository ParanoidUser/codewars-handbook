import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, Kata.consecutiveSum(15));
    assertEquals(1, Kata.consecutiveSum(1));
    assertEquals(2, Kata.consecutiveSum(48));
    assertEquals(2, Kata.consecutiveSum(97));
  }
}
