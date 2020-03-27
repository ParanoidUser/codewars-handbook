import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSumOfOddsAndEvens() {
    assertEquals(1, ProcessNumbers.processNumbers(new int[] {1, 3, 7})[0]);
    assertEquals(256, ProcessNumbers.processNumbers(new int[] {1, 2, 3, 7, 6, -4, 0})[0]);
    assertEquals(1331, ProcessNumbers.processNumbers(new int[] {1, 2, 3, 7, 6, -4, 0})[1]);
    assertEquals(0, ProcessNumbers.processNumbers(null)[1]);
  }
}
