import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals("alpha beta gamma delta", Solution.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    assertEquals("my cat is fat", Solution.removeDuplicateWords("my cat is my cat fat"));
  }
}
