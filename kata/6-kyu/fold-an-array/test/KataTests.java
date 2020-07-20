import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertArrayEquals(new int[]{15}, Kata.foldArray(new int[]{1, 2, 3, 4, 5}, 3));
    assertArrayEquals(new int[]{9, 6}, Kata.foldArray(new int[]{1, 2, 3, 4, 5}, 2));
    assertArrayEquals(new int[]{6, 6, 3}, Kata.foldArray(new int[]{1, 2, 3, 4, 5}, 1));
    assertArrayEquals(new int[]{14, 75, 0}, Kata.foldArray(new int[]{-9, 9, -8, 8, 66, 23}, 1));
  }
}
