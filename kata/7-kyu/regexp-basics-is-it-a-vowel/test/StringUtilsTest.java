import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsTest {
  @Test
  void sample() {
    assertTrue(StringUtils.isVowel("a"));
    assertTrue(StringUtils.isVowel("E"));
    assertFalse(StringUtils.isVowel(""));
    assertFalse(StringUtils.isVowel("ou"));
    assertFalse(StringUtils.isVowel("z"));
    assertFalse(StringUtils.isVowel("lol"));
  }
}
