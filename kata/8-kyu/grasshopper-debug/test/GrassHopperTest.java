import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GrassHopperTest {
  @Test
  void sample() {
    assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
    assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
  }
}
