import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AnagramCheckerTest {
  @Test
  void testIsAnagram() {
    assertTrue(AnagramChecker.isAnagram("elvis", "lives"));
  }
}