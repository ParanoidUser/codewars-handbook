import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void exampleTests() {
    assertTrue(Solution.isAlt("amazon"));
    assertFalse(Solution.isAlt("apple"));
    assertTrue(Solution.isAlt("banana"));
  }
}
