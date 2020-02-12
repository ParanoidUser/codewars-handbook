import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals(1, Palindromes.longestPalindrome("a"));
    assertEquals(2, Palindromes.longestPalindrome("aa"));
    assertEquals(2, Palindromes.longestPalindrome("baa"));
    assertEquals(2, Palindromes.longestPalindrome("aab"));
    assertEquals(1, Palindromes.longestPalindrome("zyabyz"));
    assertEquals(4, Palindromes.longestPalindrome("baabcd"));
    assertEquals(9, Palindromes.longestPalindrome("baablkj12345432133d"));
  }
}
