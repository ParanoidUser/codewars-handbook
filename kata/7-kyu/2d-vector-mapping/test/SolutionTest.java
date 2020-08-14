import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new double[]{46, 58}, Kata.mapVector(new double[]{46, 58}, new double[]{0, 0, 100}, new double[]{0, 0, 100}), 1e-2);
    assertArrayEquals(new double[]{125, 10}, Kata.mapVector(new double[]{50, 88}, new double[]{-25, 128, 100}, new double[]{50, 50, 100}), 1e-2);
    assertArrayEquals(new double[]{147.78, -87.0}, Kata.mapVector(new double[]{120, 58}, new double[]{100, 76, 36}, new double[]{120, -62, 50}), 1e-2);
    assertArrayEquals(new double[]{-107.14, -63.43}, Kata.mapVector(new double[]{5, 5}, new double[]{10, 20, 42}, new double[]{-100, -42, 60}), 1e-2);
  }
}