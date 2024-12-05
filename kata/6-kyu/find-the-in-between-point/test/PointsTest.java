import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PointsTest {
  @Test
  void sample() {
    assertEquals(1, Points_On_A_Line.middle_point(1, 0, 4, 5, 0, 6, -3, 0, 2));
    assertEquals(1, Points_On_A_Line.middle_point(1, 0, 4, 5, 0, 6, -7, 0, 0));
    assertEquals(2, Points_On_A_Line.middle_point(1, 2, 3, 4, 5, 6, 7, 8, 9));
    assertEquals(2, Points_On_A_Line.middle_point(-1, 0, 2, -2, 4, -1, -3, 8, -4));
    assertEquals(3, Points_On_A_Line.middle_point(0, 2, 0, 6, -2, 8, 3, 0, 4));
    assertEquals(1, Points_On_A_Line.middle_point(1, 4, 2, -7, 7, 10, 4, 2, 0));
  }
}