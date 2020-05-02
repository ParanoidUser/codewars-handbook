import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MixedTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{{1, 1}, {1, 2}, {1, 3}, {2, 1}, {2, 3}, {3, 1}, {3, 2}, {3, 3}}, Kata.cartesianNeighbor(2, 2));
  }
}
