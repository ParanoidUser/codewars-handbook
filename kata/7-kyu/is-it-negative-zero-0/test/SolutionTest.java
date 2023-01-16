import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(NegativeZeroValidator.isNegativeZero(-0f));
    assertFalse(NegativeZeroValidator.isNegativeZero(-5f));
    assertFalse(NegativeZeroValidator.isNegativeZero(-4f));
    assertFalse(NegativeZeroValidator.isNegativeZero(-3f));
    assertFalse(NegativeZeroValidator.isNegativeZero(-2f));
    assertFalse(NegativeZeroValidator.isNegativeZero(-1f));
    assertFalse(NegativeZeroValidator.isNegativeZero(0f));
    assertFalse(NegativeZeroValidator.isNegativeZero(1f));
    assertFalse(NegativeZeroValidator.isNegativeZero(2f));
    assertFalse(NegativeZeroValidator.isNegativeZero(3f));
    assertFalse(NegativeZeroValidator.isNegativeZero(4f));
    assertFalse(NegativeZeroValidator.isNegativeZero(5f));
  }
}