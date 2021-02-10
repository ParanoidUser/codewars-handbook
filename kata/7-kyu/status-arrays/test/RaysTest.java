import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class RaysTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{6, 3, 2, 1, 9, 3, 8}, Rays.status(new int[]{6, 9, 3, 8, 2, 3, 1}));
    assertArrayEquals(new int[]{-3, 4, -2, 14, 6, 9, 4, 0, 10}, Rays.status(new int[]{14, -3, 4, 6, 9, 10, -2, 4, 0}));
    assertArrayEquals(new int[]{5, -2, -3, 5, -2, 5, 1, -3, -4, 8, 7, 3, 4, 8, 9, 6}, Rays.status(new int[]{5, 5, 5, 8, 7, -2, -2, -3, 1, 9, 8, 3, -3, 4, -4, 6}));
  }
}