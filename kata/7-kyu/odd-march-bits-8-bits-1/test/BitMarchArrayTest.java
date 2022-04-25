import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class BitMarchArrayTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{
        {0, 0, 0, 1, 1, 1, 1, 1},
        {0, 0, 1, 1, 1, 1, 1, 0},
        {0, 1, 1, 1, 1, 1, 0, 0},
        {1, 1, 1, 1, 1, 0, 0, 0},
    }, BitMarchArray.bitMarch(5));

    assertArrayEquals(new int[][]{
        {0, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 0},
    }, BitMarchArray.bitMarch(7));

    assertArrayEquals(new int[][]{
        {1, 1, 1, 1, 1, 1, 1, 1},
    }, BitMarchArray.bitMarch(8));
  }
}
