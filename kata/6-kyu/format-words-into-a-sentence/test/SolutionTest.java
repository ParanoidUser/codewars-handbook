import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("one", Kata.formatWords(new String[] {"one"}));
    assertEquals("three", Kata.formatWords(new String[] {"", "", "three"}));
    assertEquals("one and two", Kata.formatWords(new String[] {"one", "two", ""}));
    assertEquals("one and three", Kata.formatWords(new String[] {"one", "", "three"}));
    assertEquals("one, two, three and four", Kata.formatWords(new String[] {"one", "two", "three", "four"}));
    assertEquals("", Kata.formatWords(new String[] {}));
    assertEquals("", Kata.formatWords(null));
    assertEquals("", Kata.formatWords(new String[] {""}));
  }
}
