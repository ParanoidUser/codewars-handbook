import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertTrue(Solution.check(new Object[] {66, 101}, 66));
    assertTrue(Solution.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
    assertTrue(Solution.check(new Object[] {'t', 'e', 's', 't'}, 'e'));
    assertFalse(Solution.check(new Object[] {"what", "a", "great", "kata"}, "kat"));
  }
}
