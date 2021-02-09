import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, Kata.nextId(new int[]{0, 1, 2, 3, 5}));
    assertEquals(4, Kata.nextId(new int[]{1, 2, 0, 2, 3}));
    assertEquals(4, Kata.nextId(new int[]{1, 2, 0, 2, 3, 5}));
    assertEquals(11, Kata.nextId(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
  }
}
