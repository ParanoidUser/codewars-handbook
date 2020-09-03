import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertArrayEquals(new Object[] {new int[] {3, 5, 2}, 1}, Kata.unflatten(new int[]{3, 5, 2, 1}));
    assertArrayEquals(new Object[] {1, new int[] {4, 5, 2, 1}, 2, new int[] {4, 5, 2, 6}, 2, new int[] {3, 3}}, Kata.unflatten(new int[] {1, 4, 5, 2, 1, 2, 4, 5, 2, 6, 2, 3, 3}));
  }
}
