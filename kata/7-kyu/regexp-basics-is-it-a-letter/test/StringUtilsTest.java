import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsTest {
  @Test
  void sample() {
    assertTrue(StringUtils.isLetter("a"));
    assertTrue(StringUtils.isLetter("X"));
    assertFalse(StringUtils.isLetter(""));
    assertFalse(StringUtils.isLetter("7"));
    assertFalse(StringUtils.isLetter("*"));
    assertFalse(StringUtils.isLetter("ab"));
    assertFalse(StringUtils.isLetter("a\n"));
  }
}
