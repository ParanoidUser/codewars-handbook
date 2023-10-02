import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(13, Solution.closingInSum(121L));
    assertEquals(22, Solution.closingInSum(1039L));
    assertEquals(100, Solution.closingInSum(22225555L));
    assertEquals(72, Solution.closingInSum(2520L));
    assertEquals(331, Solution.closingInSum(5332824166496569L));
    assertEquals(485, Solution.closingInSum(1979672314137318116L));
    assertEquals(548, Solution.closingInSum(1795459644013947776L));
    assertEquals(426, Solution.closingInSum(2801980378842185820L));
    assertEquals(430, Solution.closingInSum(3440584288422776554L));
    assertEquals(342, Solution.closingInSum(1985124000275401986L));
  }
}