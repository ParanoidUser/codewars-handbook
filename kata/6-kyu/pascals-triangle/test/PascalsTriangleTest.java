import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PascalsTriangleTest {
  @Test
  void sample() {
    assertArrayEquals(new long[]{1}, PascalsTriangle.generate(1));
    assertArrayEquals(new long[]{1, 1, 1}, PascalsTriangle.generate(2));
    assertArrayEquals(new long[]{1, 1, 1, 1, 2, 1, 1, 3, 3, 1}, PascalsTriangle.generate(4));
  }
}