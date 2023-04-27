import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(new Solution().hero(10, 5));
    assertTrue(new Solution().hero(100, 40));
    assertFalse(new Solution().hero(4, 5));
    assertFalse(new Solution().hero(1500, 751));
    assertFalse(new Solution().hero(0, 1));
    assertFalse(new Solution().hero(7, 4));
  }
}