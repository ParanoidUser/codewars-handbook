import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RegexValidationTest {
  @Test
  void sample() {
    assertTrue(RegexValidation.validateTime("01:00"));
    assertTrue(RegexValidation.validateTime("1:00"));
    assertTrue(RegexValidation.validateTime("00:00"));
    assertFalse(RegexValidation.validateTime("13:1"));
    assertFalse(RegexValidation.validateTime("12:60"));
  }
}
