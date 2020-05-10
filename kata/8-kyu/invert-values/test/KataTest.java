import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Kata.invert(new int[]{-1, -2, -3, -4, -5}));
    assertArrayEquals(new int[]{1, -2, 3, -4, 5}, Kata.invert(new int[]{-1, 2, -3, 4, -5}));
    assertArrayEquals(new int[]{0}, Kata.invert(new int[]{0}));
    assertArrayEquals(new int[0], Kata.invert(new int[0]));
  }
}
