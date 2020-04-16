import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertTrue(Solution.checkThreeAndTwo(new char[] {'a', 'a', 'b', 'b', 'b'}));
    assertFalse(Solution.checkThreeAndTwo(new char[] {'a', 'c', 'a', 'c', 'b'}));
    assertFalse(Solution.checkThreeAndTwo(new char[] {'a', 'a', 'a', 'a', 'a'}));
  }
}
