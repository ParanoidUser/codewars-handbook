import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeGeneratorTest {
  @Test
  void sample() {
    assertTrue(new PalindromeGenerator().isPalindrome("otto"));
    assertFalse(new PalindromeGenerator().isPalindrome("noob"));
    assertEquals("otto", new PalindromeGenerator().generateString("otto"));
    assertEquals("Otto", new PalindromeGenerator().generateString("Otto"));
    assertEquals("oto", new PalindromeGenerator().generateString("oto"));
    assertEquals("ottonoobTest123321tseTboonotto", new PalindromeGenerator().generateString("ottonoobTest123"));
  }
}