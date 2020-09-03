import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GpsSpeedTest {
  @Test
  void sample() {
    assertEquals(41, GpsSpeed.gps(20, new double[]{.0, .23, .46, .69, .92, 1.15, 1.38, 1.61}));
    assertEquals(219, GpsSpeed.gps(12, new double[]{.0, .11, .22, .33, .44, .65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25}));
    assertEquals(80, GpsSpeed.gps(20, new double[]{.0, .18, .36, .54, .72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36, 3.6, 3.84}));
  }
}
