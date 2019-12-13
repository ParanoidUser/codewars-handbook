import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    assertEquals(AngleSum.sumOfAngles(3), 180);
    assertEquals(AngleSum.sumOfAngles(4), 360);
  }
}
