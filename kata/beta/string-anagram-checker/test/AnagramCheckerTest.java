import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AnagramCheckerTest {
  @Test
  void sample() {
    assertTrue(AnagramChecker.isAnagram("elvis", "lives"));
    assertTrue(AnagramChecker.isAnagram("elvis", ""));
    assertFalse(AnagramChecker.isAnagram("hello", "yellow"));
    assertFalse(AnagramChecker.isAnagram(null, "lives"));
    assertFalse(AnagramChecker.isAnagram("elvis", null));
  }
}