import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertEquals(4, Kata.alphabet(new int[]{2, 3, 4, 1, 12, 6, 2, 4}));
    assertEquals(5, Kata.alphabet(new int[]{20, 10, 6, 5, 4, 3, 2, 12}));
    assertEquals(7, Kata.alphabet(new int[]{2, 6, 7, 3, 14, 35, 15, 5}));
    assertEquals(7, Kata.alphabet(new int[]{2, 6, 18, 3, 6, 7, 42, 14}));
    assertEquals(7, Kata.alphabet(new int[]{20, 30, 6, 7, 4, 42, 28, 5}));
    assertEquals(20, Kata.alphabet(new int[]{7, 96, 8, 240, 12, 140, 20, 56}));
  }
}
