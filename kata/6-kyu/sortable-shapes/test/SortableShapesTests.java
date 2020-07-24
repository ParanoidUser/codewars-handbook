import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SortableShapesTests {
  @Test
  void sample() {
    List<Shape> ordered = List.of(
            new CustomShape(1.1234),
            new Square(1.1234),
            new Circle(1.1234),
            new Triangle(5, 2),
            new Triangle(4, 3),
            new Rectangle(4, 3),
            new CustomShape(16.1)
    );

    List<Shape> shuffled = new ArrayList<>(ordered);
    Collections.shuffle(shuffled);
    Collections.sort(shuffled);

    assertEquals(ordered, shuffled);
  }
}
