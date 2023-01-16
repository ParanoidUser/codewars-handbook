import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new double[]{1.0, 1.4142135624}, Kata.cartesianNeighborsDistance(3, 2, 1), 6e-11);
    assertArrayEquals(new double[]{1.0, 1.4142135624, 2.0, 2.2360679775, 2.8284271247}, Kata.cartesianNeighborsDistance(0, 0, 2), 6e-11);
  }
}