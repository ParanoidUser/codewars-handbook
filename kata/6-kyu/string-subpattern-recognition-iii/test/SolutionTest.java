import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("a", Kata.hasSubpattern("a"));
    assertEquals("a", Kata.hasSubpattern("aaaa"));
    assertEquals("abcd", Kata.hasSubpattern("abcd"));
    assertEquals("ab", Kata.hasSubpattern("babababababababa"));
    assertEquals("ab", Kata.hasSubpattern("bbabbaaabbaaaabb"));
    assertEquals("123a", Kata.hasSubpattern("123a123a123a"));
    assertEquals("111222333Aaa", Kata.hasSubpattern("123A123a123a"));
    assertEquals("123a", Kata.hasSubpattern("12aa13a21233"));
    assertEquals("111222333Aaaa", Kata.hasSubpattern("12aa13a21233A"));
    assertEquals("aaabbccccdd", Kata.hasSubpattern("abcdabcaccd"));
  }
}