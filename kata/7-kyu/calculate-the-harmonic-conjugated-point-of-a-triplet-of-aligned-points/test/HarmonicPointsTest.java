import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HarmonicPointsTest {
  @Test
  void sample() {
    assertEquals(9.3333, HarmonicPoints.harmPoints(6, 10, 11), 0.0001);
    assertEquals(7.1429, HarmonicPoints.harmPoints(2, 10, 20), 0.0001);
  }
}
