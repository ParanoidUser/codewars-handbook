import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[0][], Kata.pyramid(0));
    assertArrayEquals(new int[][]{{1}}, Kata.pyramid(1));
    assertArrayEquals(new int[][]{{1}, {1, 1}}, Kata.pyramid(2));
    assertArrayEquals(new int[][]{{1}, {1, 1}, {1, 1, 1}}, Kata.pyramid(3));
  }
}