import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MinMaxTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 1}, MinMax.minMax(new int[]{1}));
    assertArrayEquals(new int[]{1, 5}, MinMax.minMax(new int[]{1, 2, 3, 4, 5}));
    assertArrayEquals(new int[]{5, 2334454}, MinMax.minMax(new int[]{2334454, 5}));
  }
}
