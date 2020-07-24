import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertArrayEquals(new Integer[] {1, 2, 7, 4, 5, 6, 3, 8, 9}, Kata.sortTwisted37(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
    assertArrayEquals(new Integer[] {12, 14, 13}, Kata.sortTwisted37(new Integer[] {12, 13, 14}));
    assertArrayEquals(new Integer[] {2, 7, 4, 3, 9}, Kata.sortTwisted37(new Integer[] {9, 2, 4, 7, 3}));
  }
}
