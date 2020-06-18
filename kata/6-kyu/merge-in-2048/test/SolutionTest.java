import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{4, 2, 0, 0}, M2048.merge(new int[]{2, 0, 2, 2}));
    assertArrayEquals(new int[]{4, 4, 0, 0}, M2048.merge(new int[]{2, 0, 2, 4}));
    assertArrayEquals(new int[]{4, 0, 0, 0}, M2048.merge(new int[]{0, 0, 2, 2}));
    assertArrayEquals(new int[]{4, 4, 2, 0, 0}, M2048.merge(new int[]{2, 2, 2, 2, 2}));
    assertArrayEquals(new int[]{8, 2, 32, 32, 16, 4, 16, 4, 32, 4, 0, 0, 0, 0}, M2048.merge(new int[]{8, 2, 16, 16, 32, 0, 16, 4, 16, 4, 16, 16, 4, 0}));
  }
}