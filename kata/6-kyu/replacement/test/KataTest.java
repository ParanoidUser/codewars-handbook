import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 1, 2, 3, 4}, Kata.replacement(new int[]{1, 2, 3, 4, 5}));
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Kata.replacement(new int[]{2, 3, 4, 5, 6}));
    assertArrayEquals(new int[]{1, 2, 2}, Kata.replacement(new int[]{2, 2, 2}));
    assertArrayEquals(new int[]{1}, Kata.replacement(new int[]{42}));
    assertArrayEquals(new int[]{2}, Kata.replacement(new int[]{1}));
  }
}