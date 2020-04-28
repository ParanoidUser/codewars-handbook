import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1.62, Geometry.squareArea(2), 1e-15);
    assertEquals(0, Geometry.squareArea(0), 1e-15);
    assertEquals(80, Geometry.squareArea(14.05), 1e-15);
  }
}
