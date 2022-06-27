import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ParenthesisTest {
  @Test
  void sample() {
    assertTrue(Parenthesis.validate("()"));
    assertTrue(Parenthesis.validate("(())"));
    assertTrue(Parenthesis.validate("((())())"));
    assertFalse(Parenthesis.validate("((())()))"));
    assertFalse(Parenthesis.validate("((())()))"));
    assertFalse(Parenthesis.validate("(a)"));
    assertFalse(Parenthesis.validate(")))"));
    assertFalse(Parenthesis.validate("((("));
  }
}