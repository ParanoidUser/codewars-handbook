import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SmashWordsTest {
  @Test
  void sample() {
    assertEquals("", SmashWords.smash());
    assertEquals("Bilal", SmashWords.smash("Bilal"));
    assertEquals("Bilal Djaghout", SmashWords.smash("Bilal", "Djaghout"));
  }
}
