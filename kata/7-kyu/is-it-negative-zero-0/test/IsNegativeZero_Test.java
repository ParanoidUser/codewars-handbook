import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsNegativeZero_Test {
  @Test
  public void basic_tests() {
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
