import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HarmonicPointsTest {
  @Test
  public void test() {
    assertEquals(9.3333, HarmonicPoints.harmPoints(6, 10, 11), 0.0001);
    assertEquals(7.1429, HarmonicPoints.harmPoints(2, 10, 20), 0.0001);
  }
}
