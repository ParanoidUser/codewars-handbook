import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
    assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
    assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
  }
}
