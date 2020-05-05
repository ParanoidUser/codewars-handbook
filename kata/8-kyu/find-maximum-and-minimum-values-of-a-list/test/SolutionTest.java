import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(-110, Kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
    assertEquals(0, Kata.min(new int[]{42, 54, 65, 87, 0}));
    assertEquals(566, Kata.max(new int[]{4, 6, 2, 1, 9, 63, -134, 566}));
    assertEquals(5, Kata.max(new int[]{5}));
  }
}
