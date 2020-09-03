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
    }, BitMarchArray.BitMarch(5));

    assertArrayEquals(new int[][]{
        {0, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 0},
    }, BitMarchArray.BitMarch(7));

    assertArrayEquals(new int[][]{
        {1, 1, 1, 1, 1, 1, 1, 1},
    }, BitMarchArray.BitMarch(8));
  }
}
