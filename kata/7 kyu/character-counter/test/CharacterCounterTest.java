import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CharacterCounterTest {
  @Test
  public void testValidWords() {
    assertTrue(CharacterCounter.validateWord("abcabc"));
    assertTrue(CharacterCounter.validateWord("Abcabc"));
    assertTrue(CharacterCounter.validateWord("AbcCBa"));
    assertTrue(CharacterCounter.validateWord("?!?!?!"));
    assertTrue(CharacterCounter.validateWord("abc123"));
    assertTrue(CharacterCounter.validateWord("abc!abc!"));
  }

  @Test
  public void testInvalidWords() {
    assertFalse(CharacterCounter.validateWord("AbcabcC"));
    assertFalse(CharacterCounter.validateWord("pippi"));
    assertFalse(CharacterCounter.validateWord("abcabcd"));
    assertFalse(CharacterCounter.validateWord("?abc:abc"));
  }
}
