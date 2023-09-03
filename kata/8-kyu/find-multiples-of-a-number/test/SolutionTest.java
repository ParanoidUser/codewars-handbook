import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{5, 10, 15, 20, 25}, Multiples.find(5, 25));
    assertArrayEquals(new int[]{1, 2}, Multiples.find(1, 2));
    assertArrayEquals(new int[]{5}, Multiples.find(5, 7));
    assertArrayEquals(new int[]{4, 8, 12, 16, 20, 24}, Multiples.find(4, 27));
    assertArrayEquals(new int[]{11, 22, 33, 44}, Multiples.find(11, 54));
  }
}