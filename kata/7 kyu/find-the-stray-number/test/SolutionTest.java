import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void simpleArray1() {
    assertEquals(2, Solution.stray(new int[] {1, 1, 2}));
  }
}
