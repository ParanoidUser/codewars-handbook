import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("a", StringHandling.longestAlpabeticalSubstring("a"));
    assertEquals("f", StringHandling.longestAlpabeticalSubstring("f"));
    assertEquals("z", StringHandling.longestAlpabeticalSubstring("z"));
    assertEquals("f", StringHandling.longestAlpabeticalSubstring("fda"));
    assertEquals("z", StringHandling.longestAlpabeticalSubstring("zyx"));
    assertEquals("z", StringHandling.longestAlpabeticalSubstring("zpda"));
    assertEquals("as", StringHandling.longestAlpabeticalSubstring("asd"));
    assertEquals("ab", StringHandling.longestAlpabeticalSubstring("nab"));
    assertEquals("abcde", StringHandling.longestAlpabeticalSubstring("abcdeapbcdef"));
    assertEquals("fgikl", StringHandling.longestAlpabeticalSubstring("asdfbyfgiklag"));
    assertEquals("aaaabbbbctt", StringHandling.longestAlpabeticalSubstring("asdfaaaabbbbcttavvfffffdf"));
  }
}
