import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {
  @Test
  void testIsPalindrome() {
    assertTrue(PalindromChecker.isPalindrome("race car"));
    assertTrue(PalindromChecker.isPalindrome("Amor, Roma"));
    assertFalse(PalindromChecker.isPalindrome(null));
    assertFalse(PalindromChecker.isPalindrome("123521"));
  }
}