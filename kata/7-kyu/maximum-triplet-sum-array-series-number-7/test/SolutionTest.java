import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void check_Positive_Values() {
    assertEquals(17, Solution.maxTriSum(new int[] {3, 2, 6, 8, 2, 3}));
    assertEquals(32, Solution.maxTriSum(new int[] {2, 9, 13, 10, 5, 2, 9, 5}));
    assertEquals(18, Solution.maxTriSum(new int[] {2, 1, 8, 0, 6, 4, 8, 6, 2, 4}));
  }

  @Test
  public void check_Negative_Values() {
    assertEquals(-9, Solution.maxTriSum(new int[] {-3, -27, -4, -2, -27, -2}));
    assertEquals(-33, Solution.maxTriSum(new int[] {-14, -12, -7, -42, -809, -14, -12}));
  }

  @Test
  public void check_Mixture_Values() {
    assertEquals(232, Solution.maxTriSum(new int[] {-13, -50, 57, 13, 67, -13, 57, 108, 67}));
    assertEquals(41, Solution.maxTriSum(new int[] {-7, 12, -7, 29, -5, 0, -7, 0, 0, 29}));
  }
}
