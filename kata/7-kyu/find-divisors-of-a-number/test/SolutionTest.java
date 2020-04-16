import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(3, FindDivisor.numberOfDivisors(4));
    assertEquals(2, FindDivisor.numberOfDivisors(5));
    assertEquals(6, FindDivisor.numberOfDivisors(12));
    assertEquals(8, FindDivisor.numberOfDivisors(30));
  }
}
