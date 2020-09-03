import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(120., GeometryBasics.trianglePerimeter(
            new Geometry.Triangle(
                new Geometry.Point(10, 10),
                new Geometry.Point(40, 10),
                new Geometry.Point(10, 50))),
        0.000001);
    assertEquals(135.314734, GeometryBasics.trianglePerimeter(
            new Geometry.Triangle(
                new Geometry.Point(15, -10),
                new Geometry.Point(40, 20),
                new Geometry.Point(20, 50))),
        0.000001);
  }
}
