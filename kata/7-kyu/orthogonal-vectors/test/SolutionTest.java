import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertFalse(Solution.isOrthogonal(new int[]{1, 2}, new int[]{2, 1}));
    assertTrue(Solution.isOrthogonal(new int[]{1, -2}, new int[]{2, 1}));
    assertFalse(Solution.isOrthogonal(new int[]{7, 8}, new int[]{7, -6}));
    assertTrue(Solution.isOrthogonal(new int[]{-13, -26}, new int[]{-8, 4}));
    assertTrue(Solution.isOrthogonal(new int[]{1, 2, 3}, new int[]{0, -3, 2}));
    assertFalse(Solution.isOrthogonal(new int[]{3, 4, 5}, new int[]{6, 7, -8}));
    assertTrue(Solution.isOrthogonal(new int[]{3, -4, -5}, new int[]{-4, -3, 0}));
    assertTrue(Solution.isOrthogonal(new int[]{1, -2, 3, -4}, new int[]{-4, 3, 2, -1}));
    assertTrue(Solution.isOrthogonal(new int[]{2, 4, 5, 6, 7}, new int[]{-14, -12, 0, 8, 4}));
    assertFalse(Solution.isOrthogonal(new int[]{5, 10, 1, 20, 2}, new int[]{-2, -20, -1, 10, 5}));
  }
}
