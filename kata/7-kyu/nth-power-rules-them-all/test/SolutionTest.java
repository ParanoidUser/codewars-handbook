import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(30, Kata.modifiedSum(new int[] {1, 2, 3}, 3));
    assertEquals(30, Kata.modifiedSum(new int[] {1, 2}, 5));
  }
}
