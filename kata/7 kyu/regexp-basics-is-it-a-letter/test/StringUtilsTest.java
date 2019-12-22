import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilsTest {
  @Test
  public void fixedTests() {
    assertFalse(StringUtils.isLetter(""));
    assertTrue(StringUtils.isLetter("a"));
    assertTrue(StringUtils.isLetter("X"));
    assertFalse(StringUtils.isLetter("7"));
    assertFalse(StringUtils.isLetter("*"));
    assertFalse(StringUtils.isLetter("ab"));
    assertFalse(StringUtils.isLetter("a\n"));
  }
}
