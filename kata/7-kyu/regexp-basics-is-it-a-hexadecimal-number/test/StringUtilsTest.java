import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsTest {
  @Test
  void sample() {
    assertTrue(StringUtils.isHexNumber("0xDEADBEEF"));
    assertTrue(StringUtils.isHexNumber("1337bAbe"));
    assertTrue(StringUtils.isHexNumber("0"));
    assertFalse(StringUtils.isHexNumber(""));
    assertFalse(StringUtils.isHexNumber("0x"));
  }
}
