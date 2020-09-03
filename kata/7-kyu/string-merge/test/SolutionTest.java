import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("pere", Kata.stringMerge("person", "here", 'e'));
    assertEquals("apowiejouh", Kata.stringMerge("apowiejfoiajsf", "iwahfeijouh", 'j'));
    assertEquals("abcdefxxxyyyxyzz", Kata.stringMerge("abcdefxxxyzz", "abcxxxyyyxyzz", 'x'));
  }
}
