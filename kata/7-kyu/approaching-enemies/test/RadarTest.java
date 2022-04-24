import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RadarTest {
  @Test
  void sample() {
    assertEquals(45, Radar.calculateTime(new double[]{100, 100}, new double[]{90, 90}), 0.001);
    assertEquals(40, Radar.calculateTime(new double[]{-90, 0}, new double[]{-80, 0}), 0.001);
    assertEquals(95, Radar.calculateTime(new double[]{50, -100}, new double[]{47.5, -95}), 0.001);
  }
}
