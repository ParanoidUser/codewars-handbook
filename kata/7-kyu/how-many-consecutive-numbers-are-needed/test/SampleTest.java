import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(0, Kata.consecutive(new int[]{}));
    assertEquals(0, Kata.consecutive(new int[]{1}));
    assertEquals(0, Kata.consecutive(new int[]{1, 2, 3, 4}));
    assertEquals(2, Kata.consecutive(new int[]{4, 8, 6}));
  }
}