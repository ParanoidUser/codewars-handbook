import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[0], Kata.incrementer(new int[0]));
    assertArrayEquals(new int[]{2, 4, 6}, Kata.incrementer(new int[]{1, 2, 3}));
    assertArrayEquals(new int[]{5, 8, 0, 5, 8}, Kata.incrementer(new int[]{4, 6, 7, 1, 3}));
    assertArrayEquals(new int[]{4, 8, 2, 2, 4}, Kata.incrementer(new int[]{3, 6, 9, 8, 9}));
    assertArrayEquals(new int[]{2, 4, 6, 8, 0, 2, 4, 6, 8, 9, 0, 1, 2, 2}, Kata.incrementer(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 8}));
  }
}
