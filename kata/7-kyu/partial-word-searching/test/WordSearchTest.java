import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class WordSearchTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"lemonade", "limeade", "grapeade "}, WordSearch.findWord("ade", new String[]{"lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb"}));
    assertArrayEquals(new String[]{"Tin + Oxygen", "lox"}, WordSearch.findWord("ox", new String[]{"o x", "o x", "o x", "o x", "o x", "Tin + Oxygen", "o x", "o x", "o x", "o x", "o x", "lox", "o x", "o x"}));
    assertArrayEquals(new String[]{"Empty"}, WordSearch.findWord("   ", new String[]{"o x", "o x", "o x"}));
  }
}
