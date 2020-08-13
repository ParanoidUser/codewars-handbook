import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("f", Kata.addLetters("a", "b", "c"));
    assertEquals("z", Kata.addLetters("z"));
    assertEquals("c", Kata.addLetters("a", "b"));
    assertEquals("c", Kata.addLetters("c"));
    assertEquals("a", Kata.addLetters("z", "a"));
    assertEquals("d", Kata.addLetters("y", "c", "b"));
    assertEquals("z", Kata.addLetters());
  }
}
