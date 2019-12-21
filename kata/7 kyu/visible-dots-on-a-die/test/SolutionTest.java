import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(17, DiceDotCount.totalAmountVisible(3, 6));
    assertEquals(30, DiceDotCount.totalAmountVisible(3, 8));
    assertEquals(66, DiceDotCount.totalAmountVisible(1, 12));
  }
}
