import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class StatsTest {
  @Test
  void sample() {
    double[][] data = {{800, 1200, 2100, 4100, 1300, 700}, {1000, 1500, 4500, 5000, 5800, 2000, 1500}};
    double[][] expect = {{2100, 3100, 4100}, {4500, 5100, 5800}, {2100, 4300, 5800}};
    assertArrayEquals(expect, Stats.getMinAvgMax(2, data));
  }
}
