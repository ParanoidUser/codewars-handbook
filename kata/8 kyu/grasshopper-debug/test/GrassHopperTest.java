import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GrassHopperTest {

  @Test
  public void testA() {
    assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
  }

  @Test
  public void testB() {
    assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
  }
}
