import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("elppa", Kata.reverseWords("apple"));
    assertEquals("a b c d", Kata.reverseWords("a b c d"));
    assertEquals("elbuod  decaps  sdrow", Kata.reverseWords("double  spaced  words"));
    assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords("The quick brown fox jumps over the lazy dog."));
  }
}