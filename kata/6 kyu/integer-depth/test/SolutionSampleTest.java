import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionSampleTest {
  @Test
  public void sampleTest1() {
    assertEquals(10, MySolution.computeDepth(1));
  }

  @Test
  public void sampleTest2() {
    assertEquals(9, MySolution.computeDepth(42));
  }
}
