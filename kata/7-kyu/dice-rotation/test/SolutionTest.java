import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Kata.rotations(new int[]{3, 3, 3}));
    assertEquals(2, Kata.rotations(new int[]{1, 1, 6}));
    assertEquals(2, Kata.rotations(new int[]{1, 2, 3}));
    assertEquals(3, Kata.rotations(new int[]{1, 6, 2, 3}));
  }
}
