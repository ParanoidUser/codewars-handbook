import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PolygonTest {
  @Test
  void sample() {
    assertEquals(5.000, new Polygon(4, 5).circleDiameter(), 10e-3);
    assertEquals(21.728, new Polygon(8, 9).circleDiameter(),10e-3);
    assertEquals(2.309, new Polygon(3, 4).circleDiameter(),10e-3);
  }
}
