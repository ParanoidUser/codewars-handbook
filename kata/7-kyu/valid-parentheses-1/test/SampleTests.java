import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class SampleTests {
  @ParameterizedTest
  @EmptySource
  @ValueSource(strings = {"()", "((()))", "()()()", "(()())()", "()(())((()))(())()"})
  void validCases(String input) {
    assertTrue(Kata.validParentheses(input));
  }

  @ParameterizedTest
  @ValueSource(strings = {")(", "()()(", "((())", "())(()", ")()", ")"})
  void invalidCases(String input) {
    assertFalse(Kata.validParentheses(input));
  }
}