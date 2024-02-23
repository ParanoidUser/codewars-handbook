import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("a", Kata.firstNonRepeatingLetter("a"));
    assertEquals("", Kata.firstNonRepeatingLetter("aA"));
    assertEquals("t", Kata.firstNonRepeatingLetter("streSS"));
    assertEquals("-", Kata.firstNonRepeatingLetter("moon-men"));
    assertEquals("", Kata.firstNonRepeatingLetter("moonmoon"));
  }
}