import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {
  @ParameterizedTest
  @ValueSource(strings = {"", "C", "HELLO I AM DONALD", "ACSKLDFJSGSKLDFJSKLDFJ", "123", "$#*%"})
  void uppercase(String input) {
    assertTrue(Kata.isUpperCase(input));
  }

  @ParameterizedTest
  @ValueSource(strings = {"c", "hello I AM DONALD", "ACSKLDFJSgSKLDFJSKLDFJ"})
  void negative(String input) {
    assertFalse(Kata.isUpperCase(input));
  }
}