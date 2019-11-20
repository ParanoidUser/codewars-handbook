import java.awt.geom.Point2D;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoordinatesTest {
  @Test
  public void test_1() {
    assertEquals(new Point2D.Double(0.0, 1.0), CoordinatesInspector.coordinates(90.0, 1.0));
  }
}
