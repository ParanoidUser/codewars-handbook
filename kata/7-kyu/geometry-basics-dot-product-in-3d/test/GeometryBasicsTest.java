import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GeometryBasicsTest {
  @Test
  void sample() {
    assertEquals(-1., GeometryBasics.dotProduct(new Vector3D(2, 0, -1), new Vector3D(0, -2, 1)), 0.000001);
    assertEquals(2., GeometryBasics.dotProduct(new Vector3D(1, 1, 1), new Vector3D(2, -2, 2)), 0.000001);
    assertEquals(-0.05, GeometryBasics.dotProduct(new Vector3D(7, 2.5, -3), new Vector3D(0.4, -0.9, 0.2)), 0.000001);
  }
}
