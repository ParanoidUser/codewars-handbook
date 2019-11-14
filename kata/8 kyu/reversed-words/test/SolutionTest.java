import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
    assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
    assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
  }
}
