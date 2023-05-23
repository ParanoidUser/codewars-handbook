import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Kata.sequenceSum(16, 15, 3));
    assertEquals(2, Kata.sequenceSum(2, 2, 2));
    assertEquals(12, Kata.sequenceSum(2, 6, 2));
    assertEquals(15, Kata.sequenceSum(1, 5, 1));
    assertEquals(5, Kata.sequenceSum(1, 5, 3));
    assertEquals(45, Kata.sequenceSum(0, 15, 3));
  }
}