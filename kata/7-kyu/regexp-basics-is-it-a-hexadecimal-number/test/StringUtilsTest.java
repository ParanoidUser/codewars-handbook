import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilsTest {
  @Test
  public void fixedTests() {
    assertFalse(StringUtils.isHexNumber(""));
    assertFalse(StringUtils.isHexNumber("0x"));
    assertTrue(StringUtils.isHexNumber("0xDEADBEEF"));
    assertTrue(StringUtils.isHexNumber("1337bAbe"));
    assertTrue(StringUtils.isHexNumber("0"));
  }
}
