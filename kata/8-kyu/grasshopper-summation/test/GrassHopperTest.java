import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GrassHopperTest {
  @Test
  void sample() {
    assertEquals(1, GrassHopper.summation(1));
    assertEquals(36, GrassHopper.summation(8));
  }
}
