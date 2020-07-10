import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.solve("abc"));
    assertFalse(Solution.solve("abd"));
    assertTrue(Solution.solve("dabc"));
    assertFalse(Solution.solve("abbc"));
  }
}