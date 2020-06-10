import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.isAlt("amazon"));
    assertFalse(Solution.isAlt("apple"));
    assertTrue(Solution.isAlt("banana"));
  }
}
