import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testBasic() {
    assertEquals(2.0, JomoPipi.evaluateFunction(2), 0.000000001);
    assertEquals(3.0, JomoPipi.evaluateFunction(6), 0.000000001);
    assertEquals(4.0, JomoPipi.evaluateFunction(12), 0.000000001);
  }
}
