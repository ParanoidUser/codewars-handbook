import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IdentifierCheckerTest {
  @Test
  void sample() {
    assertTrue(IdentifierChecker.isValid("okay_ok1"));
    assertFalse(IdentifierChecker.isValid("1i"));
  }
}
