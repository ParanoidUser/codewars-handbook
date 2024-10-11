import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ShapeUtilitiesTest {
  @Test
  void shouldWorkForShapes() {
    List<Shape> shapes = List.of(new Circle(2), new Rectangle(3, 3), new Square(2));
    assertEquals(25.567, ShapeUtilities.sumAllAreas(shapes), 1e-2);
  }

  @Test
  void shouldWorkForCircles() {
    List<Circle> circles = List.of(new Circle(2), new Circle(1), new Circle(5));
    assertEquals(94.247, ShapeUtilities.sumAllAreas(circles), 1e-2);
  }

  @Test
  void shouldWorkForRectangles() {
    List<Shape> rectangles = List.of(new Rectangle(3, 1), new Square(2), new Rectangle(1, 2));
    assertEquals(9.0, ShapeUtilities.sumAllAreas(rectangles), 1e-2);
  }
}