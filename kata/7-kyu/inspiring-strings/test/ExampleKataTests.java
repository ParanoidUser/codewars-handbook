import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleKataTests {
  @Test
  void sample() {
    assertEquals("fgh", Kata.longestWord("a b c d e fgh"));
    assertEquals("three", Kata.longestWord("one two three"));
    assertEquals("grey", Kata.longestWord("red blue grey"));
    assertEquals("orange", Kata.longestWord("orange red blue grey"));
    assertEquals("", Kata.longestWord("   "));
  }
}
