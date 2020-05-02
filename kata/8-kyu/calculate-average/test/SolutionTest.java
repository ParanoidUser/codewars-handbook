import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Kata.find_average(new int[]{1, 1, 1}), 1e-15);
    assertEquals(2, Kata.find_average(new int[]{1, 2, 3}), 1e-15);
  }
}
