import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void exampleTests() {
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
