import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class XYPlaneTest {
  @Test
  void sample() {
    assertEquals(
        List.of(new Point(2, 2)),
        XYPlane.findClosestPoints(new Point(1, 0), List.of(
            new Point(2, 2),
            new Point(4, -2),
            new Point(-3, -2),
            new Point(-4, 3)
        )));

    assertEquals(
        List.of(new Point(1, 3)),
        XYPlane.findClosestPoints(new Point(1, 3), List.of(
            new Point(-1, -5),
            new Point(1, 3),
            new Point(6, 1),
            new Point(1, -9)
        )));

    assertEquals(
        List.of(new Point(-7, -4)),
        XYPlane.findClosestPoints(new Point(-1, -7), List.of(
            new Point(2, 3),
            new Point(-1, 6),
            new Point(-7, -4),
            new Point(20, -8)
        )));

    assertEquals(
        List.of(new Point(-1, -1)),
        XYPlane.findClosestPoints(new Point(0, 0), List.of(
            new Point(5, 6),
            new Point(2, 8),
            new Point(-1, -1),
            new Point(-7, 5)
        )));

    assertEquals(
        List.of(new Point(0, -1), new Point(0, 1), new Point(-1, 0), new Point(1, 0)),
        XYPlane.findClosestPoints(new Point(0, 0), List.of(
            new Point(0, -1),
            new Point(0, 1),
            new Point(-1, -1),
            new Point(-1, 0),
            new Point(-1, 1),
            new Point(1, -1),
            new Point(1, 0),
            new Point(1, 1)
        )));
  }
}