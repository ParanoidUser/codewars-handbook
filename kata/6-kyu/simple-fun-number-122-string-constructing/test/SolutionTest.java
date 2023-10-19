import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, Kata.stringConstructing("aba", "abaa"));
    assertEquals(9, Kata.stringConstructing("aba", "abbabba"));
    assertEquals(3, Kata.stringConstructing("aba", "a"));
    assertEquals(1, Kata.stringConstructing("a", "a"));
    assertEquals(3, Kata.stringConstructing("a", "aaa"));
    assertEquals(64, Kata.stringConstructing("abcdefgh", "hgfedcba"));
    assertEquals(288, Kata.stringConstructing("sxdfcgdgxdfgdxxf", "xgdfsxgdxgfsgdfxgfdgfgdfgdgsdfxgfdxgdfxgdgdfgdfxgsdxgdfxgfgsxfgdfgsdfxgdfxgsgsfgxsgsdxgsdfxgsgsdfxgsdfx"));
    assertEquals(12, Kata.stringConstructing("bbaabcbcbc", "bbcccbabcc"));
  }
}