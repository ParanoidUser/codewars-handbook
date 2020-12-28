import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("a", Kata.removeParentheses("a(b(c))"));
    assertEquals("a e", Kata.removeParentheses("a (bc d)e"));
    assertEquals("  ", Kata.removeParentheses("(first group) (second group) (third group)"));
    assertEquals("exampleexample", Kata.removeParentheses("example(unwanted thing)example"));
    assertEquals("example  example", Kata.removeParentheses("example (unwanted thing) example"));
    assertEquals("hello example  something", Kata.removeParentheses("hello example (words(more words) here) something"));
  }
}