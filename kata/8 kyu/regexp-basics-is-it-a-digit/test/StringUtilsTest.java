import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilsTest {
  @Test
  public void fixedTests() {
    assertFalse(StringUtils.isDigit(""));
    assertTrue(StringUtils.isDigit("7"));
    assertFalse(StringUtils.isDigit(" "));
    assertFalse(StringUtils.isDigit("a"));
    assertFalse(StringUtils.isDigit("a5"));
    assertFalse(StringUtils.isDigit("14"));
  }
}
