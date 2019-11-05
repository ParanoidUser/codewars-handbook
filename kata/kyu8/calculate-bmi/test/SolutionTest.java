import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testBMI() {
    assertEquals("Normal", Calculate.bmi(80, 1.80));
  }
}
