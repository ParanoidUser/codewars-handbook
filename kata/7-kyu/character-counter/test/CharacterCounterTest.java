import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CharacterCounterTest {
  @Test
  void sample() {
    assertTrue(CharacterCounter.validateWord("abcabc"));
    assertTrue(CharacterCounter.validateWord("Abcabc"));
    assertTrue(CharacterCounter.validateWord("AbcCBa"));
    assertTrue(CharacterCounter.validateWord("?!?!?!"));
    assertTrue(CharacterCounter.validateWord("abc123"));
    assertTrue(CharacterCounter.validateWord("abc!abc!"));
    assertFalse(CharacterCounter.validateWord("AbcabcC"));
    assertFalse(CharacterCounter.validateWord("pippi"));
    assertFalse(CharacterCounter.validateWord("abcabcd"));
    assertFalse(CharacterCounter.validateWord("?abc:abc"));
  }
}
