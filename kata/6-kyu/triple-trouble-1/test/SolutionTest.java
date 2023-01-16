import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Kata.TripleDouble(451999277L, 41177722899L));
    assertEquals(0, Kata.TripleDouble(1222345L, 12345L));
    assertEquals(0, Kata.TripleDouble(12345L, 12345L));
    assertEquals(1, Kata.TripleDouble(666789L, 12345667L));
    assertEquals(0, Kata.TripleDouble(451999277L, 411777228L));
    assertEquals(0, Kata.TripleDouble(1112L, 122L));
  }
}