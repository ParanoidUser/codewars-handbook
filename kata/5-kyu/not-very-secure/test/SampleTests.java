import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SampleTests {
  @ParameterizedTest
  @ValueSource(strings = {"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"})
  void valid(String input) {
    assertTrue(SecureTester.alphanumeric(input));
  }

  @ParameterizedTest
  @ValueSource(strings = {"", "with space", "with_underscore", "punctuation.", "naïve", "１strangedigit", "emoji😊"})
  void invalid(String input) {
    assertFalse(SecureTester.alphanumeric(input));
  }
}