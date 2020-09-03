import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VectorMagnitudeTest {
  @Test
  void sample() {
    assertEquals(0d, Kata.magnitude(new double[] {0d, 0d}), 1e-10);
    assertEquals(6d, Kata.magnitude(new double[] {-2d, -4d, 4d}), 1e-10);
    assertEquals(1d, Kata.magnitude(new double[] {2d / 3d, 1d / 3d, 2d / 3d}), 1e-10);
  }
}
