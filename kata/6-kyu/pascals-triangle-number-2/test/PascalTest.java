import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PascalTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{{1}}, PascalsTriangle.pascal(1));
    assertArrayEquals(new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}}, PascalsTriangle.pascal(5));
  }
}
