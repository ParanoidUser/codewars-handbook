import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void simpleTests() {
    assertTrue(Solution.isAllPossibilities(new int[] {0, 1, 2, 3}));
    assertFalse(Solution.isAllPossibilities(new int[] {1, 2, 3, 4}));
    assertFalse(Solution.isAllPossibilities(new int[] {6, 0, 4}));
    assertFalse(Solution.isAllPossibilities(new int[] {0, 2, 2, 3}));
  }
}
