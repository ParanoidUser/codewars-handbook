import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution_Test {
  @Test
  public void check_Balanced_Number() {
    assertEquals("Balanced", Solution.balancedNum(7));
    assertEquals("Balanced", Solution.balancedNum(959));
    assertEquals("Balanced", Solution.balancedNum(13));
    assertEquals("Not Balanced", Solution.balancedNum(432));
    assertEquals("Balanced", Solution.balancedNum(424));
  }

  @Test
  public void check_Larger_Number() {
    assertEquals("Not Balanced", Solution.balancedNum(1024));
    assertEquals("Not Balanced", Solution.balancedNum(66545));
    assertEquals("Not Balanced", Solution.balancedNum(295591));
    assertEquals("Not Balanced", Solution.balancedNum(1230987));
    assertEquals("Balanced", Solution.balancedNum(56239814));
  }
}
