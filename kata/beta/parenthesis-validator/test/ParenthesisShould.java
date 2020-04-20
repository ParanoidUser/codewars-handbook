import static org.springframework.test.util.AssertionErrors.assertTrue;

import org.junit.jupiter.api.Test;

class ParenthesisShould {
  @Test
  void testBasics() {
    assertTrue("failed ()", Parenthesis.validate("()"));
    assertTrue("failed (())", Parenthesis.validate("(())"));
    assertTrue("failed ((())())", Parenthesis.validate("((())())"));
    assertTrue("failed ((())()))", !Parenthesis.validate("((())()))"));
  }
}