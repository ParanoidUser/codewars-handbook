import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.validParentheses("()"));
    assertTrue(Solution.validParentheses("32423(sgsdg)"));
    assertTrue(Solution.validParentheses("adasdasfa"));
    assertFalse(Solution.validParentheses("())"));
    assertFalse(Solution.validParentheses("(()"));
    assertFalse(Solution.validParentheses("(dsgdsg))2432"));
  }
}
