import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PositionAverageTest {
  @Test
  public void test() {
    assertEquals(26.6666666667, PositionAverage.posAverage("6900690040, 4690606946, 9990494604"), 1e-9);
    assertEquals(26.6666666667, PositionAverage.posAverage("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096"), 1e-9);
    assertEquals(29.2592592593, PositionAverage.posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490"), 1e-9);
    assertEquals(100, PositionAverage.posAverage("4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444"), 1e-9);
    assertEquals(100, PositionAverage.posAverage("0, 0, 0, 0, 0, 0, 0, 0"), 1e-9);
  }
}
