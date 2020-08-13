import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SlopeTest {
  @Test
  void sample() {
    assertEquals("0", new Slope().slope(new int[]{19, 3, 20, 3}));
    assertEquals("undefined", new Slope().slope(new int[]{-7, 2, -7, 4}));
    assertEquals("5", new Slope().slope(new int[]{10, 50, 30, 150}));
    assertEquals("-5", new Slope().slope(new int[]{15, 45, 12, 60}));
    assertEquals("6", new Slope().slope(new int[]{10, 20, 20, 80}));
    assertEquals("undefined", new Slope().slope(new int[]{-10, 6, -10, 3}));
  }
}
