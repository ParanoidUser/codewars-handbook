import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {
  @Test
  void sample() {
    assertTrue(new PalindromChecker().isPalindrome("race car"));
    assertTrue(new PalindromChecker().isPalindrome("Amor, Roma"));
    assertFalse(new PalindromChecker().isPalindrome(null));
    assertFalse(new PalindromChecker().isPalindrome("123521"));
  }
}