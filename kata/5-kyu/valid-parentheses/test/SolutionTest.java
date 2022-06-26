import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.validParentheses("()"));
    assertFalse(Solution.validParentheses("())"));
    assertTrue(Solution.validParentheses("32423(sgsdg)"));
    assertFalse(Solution.validParentheses("(dsgdsg))2432"));
    assertTrue(Solution.validParentheses("adasdasfa"));
  }
}
