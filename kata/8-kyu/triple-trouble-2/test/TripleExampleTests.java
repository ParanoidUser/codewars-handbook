import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TripleExampleTests {
  @Test
  void sample() {
    assertEquals("ttlheoiscstk", Kata.tripleTrouble("this", "test", "lock"));
    assertEquals("abcabc", Kata.tripleTrouble("aa", "bb", "cc"));
    assertEquals("Batman", Kata.tripleTrouble("Bm", "aa", "tn"));
    assertEquals("LexLuthor", Kata.tripleTrouble("LLh", "euo", "xtr"));
  }
}
