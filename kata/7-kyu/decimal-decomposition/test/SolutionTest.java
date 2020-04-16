import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals("100+20+6", DecimalDecomposition.decimalDecomposition(126));
    assertEquals("700000+10000+2000+600+50+4", DecimalDecomposition.decimalDecomposition(712654));
  }
}
