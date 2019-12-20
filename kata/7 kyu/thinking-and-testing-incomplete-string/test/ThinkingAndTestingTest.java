import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThinkingAndTestingTest {
  @Test
  public void exampleTests1() {
    assertEquals("", ThinkingAndTesting.testIncompleteString(""));
    assertEquals("a", ThinkingAndTesting.testIncompleteString("a"));
    assertEquals("b", ThinkingAndTesting.testIncompleteString("b"));
  }

  @Test
  public void exampleTests2() {
    assertEquals("a", ThinkingAndTesting.testIncompleteString("aa"));
    assertEquals("a", ThinkingAndTesting.testIncompleteString("ab"));
    assertEquals("b", ThinkingAndTesting.testIncompleteString("bc"));
  }

  @Test
  public void exampleTests3() {
    assertEquals("aa", ThinkingAndTesting.testIncompleteString("aaaa"));
    assertEquals("aaa", ThinkingAndTesting.testIncompleteString("aaaaaa"));
  }
}
