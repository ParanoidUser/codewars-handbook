import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BraceCheckerTests {
  @Test
  void sample() {
    assertTrue(new BraceChecker().isValid("()"));
    assertFalse(new BraceChecker().isValid("[(])"));
  }
}
