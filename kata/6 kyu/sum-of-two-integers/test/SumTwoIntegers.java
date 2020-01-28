import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTwoIntegers {
  @Test
  public void checkPositiveValues() {
    assertEquals(3, Solution.add(1, 2));
    assertEquals(24, Solution.add(5, 19));
    assertEquals(40, Solution.add(23, 17));
  }

  @Test
  public void checkNegativeValues() {
    assertEquals(-30, Solution.add(-14, -16));
    assertEquals(-226, Solution.add(-50, -176));
    assertEquals(-39, Solution.add(-10, -29));
  }

  @Test
  public void checkMixtureValues() {
    assertEquals(0, Solution.add(-13, 13));
    assertEquals(-9, Solution.add(-27, 18));
    assertEquals(-60, Solution.add(-90, 30));
  }
}
