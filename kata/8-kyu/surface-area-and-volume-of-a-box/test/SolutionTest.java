import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{88, 48}, Kata.getSize(4, 2, 6));
    assertArrayEquals(new int[]{6, 1}, Kata.getSize(1, 1, 1));
    assertArrayEquals(new int[]{10, 2}, Kata.getSize(1, 2, 1));
    assertArrayEquals(new int[]{16, 4}, Kata.getSize(1, 2, 2));
    assertArrayEquals(new int[]{600, 1000}, Kata.getSize(10, 10, 10));
  }
}
