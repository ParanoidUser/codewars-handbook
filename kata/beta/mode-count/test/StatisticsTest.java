import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatisticsTest {
  @Test
  public void simpleTest() {
    assertEquals(3, Statistics.modeCount(new int[] {2, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6}));
    assertEquals(1, Statistics.modeCount(new int[] {2, 1, 2, 4, 6, 1, 2, 3, 4, 2, 2, 3, 4, 1, 2, 3, 4, 5, 9, 1, 3, 2, 3, 4, 2, 5, 15}));
    assertEquals(2, Statistics.modeCount(new int[] {2, 2, 2, 3, 3, 3, 4, 5, 6}));
    assertEquals(3, Statistics.modeCount(new int[] {2, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6}));
    assertEquals(1, Statistics.modeCount(new int[] {1, 2, 2, 3}));
  }
}
