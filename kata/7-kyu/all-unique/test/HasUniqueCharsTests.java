import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class HasUniqueCharsTests {
  @ParameterizedTest
  @ValueSource(strings = {"abcde", "AaBbc"})
  void unique(String str) {
    assertTrue(Kata.hasUniqueChars(str));
  }

  @ParameterizedTest
  @ValueSource(strings = {"  nAa", "++-"})
  void duplicate(String str) {
    assertFalse(Kata.hasUniqueChars(str));
  }
}