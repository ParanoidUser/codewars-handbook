import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Kata.sum(null));
    assertEquals(0, Kata.sum(new int[0]));
    assertEquals(16, Kata.sum(new int[]{6, 2, 1, 8, 10}));
  }
}
