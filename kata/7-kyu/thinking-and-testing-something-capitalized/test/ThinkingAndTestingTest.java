import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ThinkingAndTestingTest {
  @Test
  void sample() {
    assertEquals("", ThinkingAndTesting.testSomethingCapitalized(""));
    assertEquals("A", ThinkingAndTesting.testSomethingCapitalized("a"));
    assertEquals("B", ThinkingAndTesting.testSomethingCapitalized("b"));
    assertEquals("A A", ThinkingAndTesting.testSomethingCapitalized("a a"));
    assertEquals("A B", ThinkingAndTesting.testSomethingCapitalized("a b"));
    assertEquals("A B C", ThinkingAndTesting.testSomethingCapitalized("a b c"));
    assertEquals("aA", ThinkingAndTesting.testSomethingCapitalized("aa"));
  }
}