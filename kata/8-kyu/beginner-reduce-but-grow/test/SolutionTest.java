import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(6, Kata.grow(new int[]{1, 2, 3}));
    assertEquals(16, Kata.grow(new int[]{4, 1, 1, 1, 4}));
    assertEquals(64, Kata.grow(new int[]{2, 2, 2, 2, 2, 2}));
  }
}
