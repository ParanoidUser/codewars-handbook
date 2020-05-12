import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsTest {
  @Test
  void sample() {
    assertFalse(StringUtils.isDigit(""));
    assertTrue(StringUtils.isDigit("7"));
    assertFalse(StringUtils.isDigit(" "));
    assertFalse(StringUtils.isDigit("a"));
    assertFalse(StringUtils.isDigit("a5"));
    assertFalse(StringUtils.isDigit("14"));
  }
}
