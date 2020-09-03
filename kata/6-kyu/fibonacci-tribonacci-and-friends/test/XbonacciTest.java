import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class XbonacciTest {
  @Test
  void sample() {
    assertArrayEquals(new double[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, new Xbonacci().xbonacci(new double[]{0, 1}, 10));
    assertArrayEquals(new double[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, new Xbonacci().xbonacci(new double[]{1, 1}, 10));
    assertArrayEquals(new double[]{0, 0, 0, 0, 1, 1, 2, 4, 8, 16}, new Xbonacci().xbonacci(new double[]{0, 0, 0, 0, 1}, 10));
    assertArrayEquals(new double[]{1, 0, 0, 0, 0, 0, 1, 2, 3, 6}, new Xbonacci().xbonacci(new double[]{1, 0, 0, 0, 0, 0, 1}, 10));
  }
}
