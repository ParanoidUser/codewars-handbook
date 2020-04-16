import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RadarTest {
  @Test
  public void test1() {
    double[] p1 = {100, 100};
    double[] p2 = {90, 90};
    assertEquals(45, Radar.CalculateTime(p1, p2), 0.001);
  }

  @Test
  public void test2() {
    double[] p1 = {-90, 0};
    double[] p2 = {-80, 0};
    assertEquals(40, Radar.CalculateTime(p1, p2), 0.001);
  }

  @Test
  public void test3() {
    double[] p1 = {50, -100};
    double[] p2 = {47.5, -95};
    assertEquals(95, Radar.CalculateTime(p1, p2), 0.001);
  }
}
