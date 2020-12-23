import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PalindromesTest {
  @Test
  void testPalindrome() {
    assertEquals(0, Palindromes.palindromeChainLength(1));
    assertEquals(0, Palindromes.palindromeChainLength(88));
    assertEquals(0, Palindromes.palindromeChainLength(393));
  }

  @Test
  void testNonPalindrome() {
    assertEquals(1, Palindromes.palindromeChainLength(10));
    assertEquals(1, Palindromes.palindromeChainLength(134));
    assertEquals(4, Palindromes.palindromeChainLength(87));
    assertEquals(7, Palindromes.palindromeChainLength(2897));
    assertEquals(24, Palindromes.palindromeChainLength(89));
  }
}