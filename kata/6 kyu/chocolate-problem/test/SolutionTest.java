import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void test_chocolate1() {
    assertEquals(3, Solution.chocolate(5, new int[] {4, 3, 2, 5, 1}, new int[] {1, 2, 5, 3, 4}));
  }

  @Test
  public void test_chocolate2() {
    assertEquals(1, Solution.chocolate(2, new int[] {1, 2}, new int[] {2, 1}));
  }

  @Test
  public void test_chocolate3() {
    assertEquals(1, Solution.chocolate(3, new int[] {3, 1, 2}, new int[] {2, 3, 1}));
  }

  @Test
  public void test_chocolate4() {
    assertEquals(2, Solution.chocolate(3, new int[] {1, 3, 2}, new int[] {1, 2, 3}));
  }

  @Test
  public void test_chocolate5() {
    assertEquals(2, Solution.chocolate(3, new int[] {1, 2, 3}, new int[] {3, 2, 1}));
  }

  @Test
  public void test_chocolate6() {
    assertEquals(1, Solution.chocolate(4, new int[] {4, 3, 2, 1}, new int[] {2, 1, 4, 3}));
  }

  @Test
  public void test_chocolate7() {
    assertEquals(2, Solution.chocolate(5, new int[] {3, 5, 2, 1, 4}, new int[] {4, 5, 2, 1, 3}));
  }

  @Test
  public void test_chocolate8() {
    assertEquals(1, Solution.chocolate(6, new int[] {3, 6, 1, 5, 4, 2}, new int[] {1, 5, 4, 2, 3, 6}));
  }

  @Test
  public void test_chocolate9() {
    assertEquals(5, Solution.chocolate(6, new int[] {3, 6, 1, 5, 4, 2}, new int[] {1, 4, 5, 3, 2, 6}));
  }
}
