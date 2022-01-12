import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals(0, Kata.scrabbleScore(""));
    assertEquals(1, Kata.scrabbleScore("a"));
    assertEquals(1, Kata.scrabbleScore(" a"));
    assertEquals(4, Kata.scrabbleScore("f"));
    assertEquals(6, Kata.scrabbleScore("street"));
    assertEquals(6, Kata.scrabbleScore("STREET"));
    assertEquals(6, Kata.scrabbleScore("st re et"));
    assertEquals(22, Kata.scrabbleScore("quirky"));
    assertEquals(20, Kata.scrabbleScore("MULTIBILLIONAIRE"));
    assertEquals(13, Kata.scrabbleScore("alacrity"));
  }
}
