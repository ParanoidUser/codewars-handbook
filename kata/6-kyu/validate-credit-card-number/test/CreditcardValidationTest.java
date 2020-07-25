import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CreditcardValidationTest {
  @Test
  void sample() {
    assertTrue(Validate.validate("1230"));
    assertFalse(Validate.validate("891"));
  }
}
