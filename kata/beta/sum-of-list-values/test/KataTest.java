import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals(0, Kata.sumList(new int[]{0, 0}));
    assertEquals(0, Kata.sumList(new int[]{}));
    assertEquals(2, Kata.sumList(new int[]{1, 1}));
    assertEquals(4, Kata.sumList(new int[]{2, 2}));
    assertEquals(4, Kata.sumList(new int[]{2, 2}));
    assertEquals(16, Kata.sumList(new int[]{2, 2, 2, 6, 4}));
    assertEquals(21, Kata.sumList(new int[]{1, 2, 3, 4, 5, 6}));
  }
}