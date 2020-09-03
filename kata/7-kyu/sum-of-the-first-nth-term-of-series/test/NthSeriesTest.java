import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NthSeriesTest {
  @Test
  void sample() {
    assertEquals("1.57", NthSeries.seriesSum(5));
    assertEquals("1.77", NthSeries.seriesSum(9));
    assertEquals("1.94", NthSeries.seriesSum(15));
  }
}
