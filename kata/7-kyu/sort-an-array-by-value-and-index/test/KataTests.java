import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Kata.sortByValueAndIndex(new int[] {1, 2, 3, 4, 5}));
    assertArrayEquals(new int[] {2, 3, 4, 23, 5}, Kata.sortByValueAndIndex(new int[] {23, 2, 3, 4, 5}));
    assertArrayEquals(new int[] {2, 3, 4, 5, 26}, Kata.sortByValueAndIndex(new int[] {26, 2, 3, 4, 5}));
    assertArrayEquals(new int[] {1, 9, 5, 3, 4}, Kata.sortByValueAndIndex(new int[] {9, 5, 1, 4, 3}));
  }
}
