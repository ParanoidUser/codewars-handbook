import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExampleTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 1, 0
      45, 0.7071, 0.7071
      90, 0, 1
      180, -1, 0
      270, 0, -1
      360, 1, 0
      """)
  void degrees(int degrees, double dx, double dy) {
    Point point = new Circle(1, new Point(0, 0)).pointFromAngle(degrees);
    assertEquals(dx, point.x, 1E-4);
    assertEquals(dy, point.y, 1E-4);
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 1, 0
      1, 0.5403, 0.8414
      1.570796, 0, 1
      3.141592, -1, 0
      4.712388, 0, -1
      6.283184, 1, 0
      7.85398, 0, 1
      9.424776, -1, 0
      10.995572, 0, -1
      12.566368, 1, 0
      """)
  void radians(double radians, double dx, double dy) {
    Point point = new Circle(1, new Point(0, 0)).pointFromAngle(radians);
    assertEquals(dx, point.x, 1E-4);
    assertEquals(dy, point.y, 1E-4);
  }
}