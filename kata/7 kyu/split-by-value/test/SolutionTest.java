import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    assertArrayEquals(new int[] {1, 3, 4, 2, 5, 7, 6}, Solution.splitByValue(5, new int[] {1, 3, 5, 7, 6, 4, 2}));
    assertArrayEquals(new int[] {5, 2, 7, 3, 2}, Solution.splitByValue(0, new int[] {5, 2, 7, 3, 2}));
    assertArrayEquals(new int[] {4, 6, 10, 10, 6}, Solution.splitByValue(6, new int[] {6, 4, 10, 10, 6}));
  }
}
