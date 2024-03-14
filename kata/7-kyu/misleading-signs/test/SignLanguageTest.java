import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SignLanguageTest {
  @Test
  void sample() {
    assertTrue(SignLanguage.gaslighting("snack", "snake", new char[]{'c'}));
    assertTrue(SignLanguage.gaslighting("snake", "snack", new char[]{'c'}));
    assertTrue(SignLanguage.gaslighting("ping", "pong", new char[]{'i'}));
    assertFalse(SignLanguage.gaslighting("snack", "snack", new char[]{'s', 'n', 'a', 'c', 'k'}));
    assertFalse(SignLanguage.gaslighting("ping", "pong", new char[]{'p', 'n', 'g'}));
  }
}