import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSimpleWords() {
    assertEquals("as", StringHandling.longestAlpabeticalSubstring("asd"));
    assertEquals("ab", StringHandling.longestAlpabeticalSubstring("nab"));
    assertEquals("abcde", StringHandling.longestAlpabeticalSubstring("abcdeapbcdef"));
    assertEquals("aaaabbbbctt", StringHandling.longestAlpabeticalSubstring("asdfaaaabbbbcttavvfffffdf"));
    assertEquals("fgikl", StringHandling.longestAlpabeticalSubstring("asdfbyfgiklag"));
  }

  @Test
  public void testWordsWithSingleLetter() {
    assertEquals("a", StringHandling.longestAlpabeticalSubstring("a"));
    assertEquals("f", StringHandling.longestAlpabeticalSubstring("f"));
    assertEquals("z", StringHandling.longestAlpabeticalSubstring("z"));
  }

  @Test
  public void testWordsWithLettersInBackwardOrder() {
    assertEquals("z", StringHandling.longestAlpabeticalSubstring("zpda"));
    assertEquals("f", StringHandling.longestAlpabeticalSubstring("fda"));
    assertEquals("z", StringHandling.longestAlpabeticalSubstring("zyx"));
  }
}
