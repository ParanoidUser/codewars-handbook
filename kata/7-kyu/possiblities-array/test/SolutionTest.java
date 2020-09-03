import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.isAllPossibilities(new int[]{0, 1, 2, 3}));
    assertFalse(Solution.isAllPossibilities(new int[]{1, 2, 3, 4}));
    assertFalse(Solution.isAllPossibilities(new int[]{6, 0, 4}));
    assertFalse(Solution.isAllPossibilities(new int[]{0, 2, 2, 3}));
    assertFalse(Solution.isAllPossibilities(new int[0]));
  }
}
