import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void fixedTests() {
    assertEquals(24, Kata.maxContiguousSum(new int[] {3, -4, 8, 7, -10, 19, -3}));
    assertEquals(9, Kata.maxContiguousSum(new int[] {2, -3, -3, 9, -29, 8, -9}));
  }
}
