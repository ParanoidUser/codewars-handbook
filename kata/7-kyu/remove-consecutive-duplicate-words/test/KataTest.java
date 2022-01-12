import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
  @Test
  void sample() {
    assertEquals("", Kata.removeConsecutiveDuplicates(""));
    assertEquals("word", Kata.removeConsecutiveDuplicates("word"));
    assertEquals("a ab", Kata.removeConsecutiveDuplicates("a a ab"));
    assertEquals("cyqje a", Kata.removeConsecutiveDuplicates("cyqje cyqje cyqje a a a"));
    assertEquals("alpha beta gamma delta alpha beta gamma delta", Kata.removeConsecutiveDuplicates("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
  }
}
