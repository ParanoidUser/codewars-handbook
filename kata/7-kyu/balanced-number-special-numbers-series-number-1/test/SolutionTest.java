import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Balanced", Solution.balancedNum(7));
    assertEquals("Balanced", Solution.balancedNum(959));
    assertEquals("Balanced", Solution.balancedNum(13));
    assertEquals("Balanced", Solution.balancedNum(424));
    assertEquals("Balanced", Solution.balancedNum(56239814));
    assertEquals("Not Balanced", Solution.balancedNum(432));
    assertEquals("Not Balanced", Solution.balancedNum(1024));
    assertEquals("Not Balanced", Solution.balancedNum(66545));
    assertEquals("Not Balanced", Solution.balancedNum(295591));
    assertEquals("Not Balanced", Solution.balancedNum(1230987));
  }
}