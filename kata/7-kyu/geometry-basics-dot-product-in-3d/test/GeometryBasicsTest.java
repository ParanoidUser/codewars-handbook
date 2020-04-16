import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeometryBasicsTest {
  @Test
  public void sampleTests() {
    assertEquals(-1., GeometryBasics.dotProduct(new Vector(2, 0, -1), new Vector(0, -2, 1)), 0.000001);
    assertEquals(2., GeometryBasics.dotProduct(new Vector(1, 1, 1), new Vector(2, -2, 2)), 0.000001);
    assertEquals(-0.05, GeometryBasics.dotProduct(new Vector(7, 2.5, -3), new Vector(0.4, -0.9, 0.2)), 0.000001);
  }
}
