import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(14.86, Kata.areaOfPolygonInsideCircle(2.5, 5), 1e-4);
    assertEquals(11.691, Kata.areaOfPolygonInsideCircle(3, 3), 1e-4);
    assertEquals(8, Kata.areaOfPolygonInsideCircle(2, 4), 1e-4);
  }
}
