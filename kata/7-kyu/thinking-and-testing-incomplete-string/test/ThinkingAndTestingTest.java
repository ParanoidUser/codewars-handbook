import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ThinkingAndTestingTest {
  @Test
  void sample() {
    assertEquals("", ThinkingAndTesting.testIncompleteString(""));
    assertEquals("a", ThinkingAndTesting.testIncompleteString("a"));
    assertEquals("b", ThinkingAndTesting.testIncompleteString("b"));
    assertEquals("a", ThinkingAndTesting.testIncompleteString("aa"));
    assertEquals("a", ThinkingAndTesting.testIncompleteString("ab"));
    assertEquals("b", ThinkingAndTesting.testIncompleteString("bc"));
    assertEquals("aa", ThinkingAndTesting.testIncompleteString("aaaa"));
    assertEquals("aaa", ThinkingAndTesting.testIncompleteString("aaaaaa"));
  }
}
