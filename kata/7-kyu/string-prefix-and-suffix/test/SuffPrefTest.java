import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SuffPrefTest {
  @Test
  void sample() {
    assertEquals(0, SuffPref.solve("a"));
    assertEquals(0, SuffPref.solve("abcd"));
    assertEquals(0, SuffPref.solve("acbacc"));
    assertEquals(0, SuffPref.solve("abcdabcc"));
    assertEquals(1, SuffPref.solve("aa"));
    assertEquals(1, SuffPref.solve("aaa"));
    assertEquals(1, SuffPref.solve("abcda"));
    assertEquals(1, SuffPref.solve("abcabca"));
    assertEquals(2, SuffPref.solve("aaaa"));
    assertEquals(2, SuffPref.solve("aaaaa"));
    assertEquals(3, SuffPref.solve("abcdabc"));
    assertEquals(3, SuffPref.solve("abcabc"));
  }
}
