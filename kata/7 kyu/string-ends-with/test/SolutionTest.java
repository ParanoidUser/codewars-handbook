import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertTrue(Kata.solution("abc", "bc"));
    assertFalse(Kata.solution("abc", "d"));
  }
}
