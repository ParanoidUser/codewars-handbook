import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(-1, Kata.nthPower(new int[]{1, 2}, 2));
    assertEquals(8, Kata.nthPower(new int[]{3, 1, 2, 2}, 3));
    assertEquals(4, Kata.nthPower(new int[]{3, 1, 2}, 2));
  }
}
