import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectTest {
  @Test
  void sample() {
    assertEquals(100, new Solution().numberOfRectangles(4, 4));
    assertEquals(225, new Solution().numberOfRectangles(5, 5));
  }
}
