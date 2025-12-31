import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SampleTests {
  @ParameterizedTest
  @ValueSource(strings = {"a", "aba", "Abba", "Bob", "Madam", "AbBa", ""})
  void sample(String str) {
    assertTrue(Palindrome.isPalindrome(str));
  }

  @ParameterizedTest
  @ValueSource(strings = {"hello", "123521"})
  void negative(String str) {
    assertFalse(Palindrome.isPalindrome(str));
  }
}