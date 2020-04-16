import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumSum {
  @Test
  public void basicTests() {
    assertEquals(22, Solution.minSum(new int[] {5, 4, 2, 3}));
    assertEquals(342, Solution.minSum(new int[] {12, 6, 10, 26, 3, 24}));
    assertEquals(74, Solution.minSum(new int[] {9, 2, 8, 7, 5, 4, 0, 6}));
  }
}
