import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertArrayEquals(new int[]{-6, -2, 0, 1, 5, 6, 47}, SortArray.sortArray(new int[]{-2, 1, 0, 47, 5, 6, -6}));
  }
}
