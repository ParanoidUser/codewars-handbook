import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    assertEquals(180, AngleSum.sumOfAngles(3));
    assertEquals(360, AngleSum.sumOfAngles(4));
  }
}
