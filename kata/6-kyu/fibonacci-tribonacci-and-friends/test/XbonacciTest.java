import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class XbonacciTest {
  @Test
  void sample() {
    assertArrayEquals(new double[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, Xbonacci.xbonacci(new double[]{0, 1}, 10));
    assertArrayEquals(new double[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, Xbonacci.xbonacci(new double[]{1, 1}, 10));
    assertArrayEquals(new double[]{0, 0, 0, 0, 1, 1, 2, 4, 8, 16}, Xbonacci.xbonacci(new double[]{0, 0, 0, 0, 1}, 10));
    assertArrayEquals(new double[]{1, 0, 0, 0, 0, 0, 1, 2, 3, 6}, Xbonacci.xbonacci(new double[]{1, 0, 0, 0, 0, 0, 1}, 10));
  }
}
