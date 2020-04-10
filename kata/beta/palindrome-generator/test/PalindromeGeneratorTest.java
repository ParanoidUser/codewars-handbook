import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeGeneratorTest {
  @Test
  void testIsPalindromeWithSuccess() {
    assertTrue(PalindromeGenerator.isPalindrome("otto"));
  }

  @Test
  void testIsPalindromeWithFailure() {
    assertFalse(PalindromeGenerator.isPalindrome("noob"));
  }

  @Test
  void testGenerateStringWithPalindrome() {
    assertEquals("otto", PalindromeGenerator.generateString("otto"));
  }

  @Test
  void testGenerateStringWithCasePalindrome() {
    assertEquals("Otto", PalindromeGenerator.generateString("Otto"));
  }

  @Test
  void testGenerateStringWithOddPalindrome() {
    assertEquals("oto", PalindromeGenerator.generateString("oto"));
  }

  @Test
  void testGenerateStringWithoutPalindrome() {
    assertEquals("ottonoobTest123321tseTboonotto", PalindromeGenerator.generateString("ottonoobTest123"));
  }
}