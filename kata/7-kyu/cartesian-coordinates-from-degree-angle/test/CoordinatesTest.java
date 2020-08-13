import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.geom.Point2D;
import org.junit.jupiter.api.Test;

class CoordinatesTest {
  @Test
  void sample() {
    assertEquals(new Point2D.Double(0.0, 1.0), new CoordinatesInspector().coordinates(90.0, 1.0));
  }
}
