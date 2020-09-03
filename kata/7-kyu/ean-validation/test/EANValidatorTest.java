import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class EANValidatorTest {
  @Test
  void sample() {
    assertTrue(EANValidator.validate("9783815820865"));
    assertFalse(EANValidator.validate("9783815820864"));
    assertTrue(EANValidator.validate("9783827317100"));
  }
}
