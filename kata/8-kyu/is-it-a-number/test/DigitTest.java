import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DigitTest {
  @Test
  void sample() {
    assertTrue(new MyUtilities().isDigit("-234.4"));
    assertFalse(new MyUtilities().isDigit("s2324"));
  }
}
