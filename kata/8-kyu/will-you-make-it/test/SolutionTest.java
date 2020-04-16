import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertTrue(Kata.zeroFuel(50, 25, 2));
    assertFalse(Kata.zeroFuel(100, 50, 1));
  }
}
