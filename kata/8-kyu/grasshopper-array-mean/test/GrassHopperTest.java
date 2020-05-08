import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GrassHopperTest {
  @Test
  void sample() {
    assertEquals(1, GrassHopper.findAverage(new int[]{1}));
    assertEquals(4, GrassHopper.findAverage(new int[]{1, 3, 5, 7}));
  }
}
