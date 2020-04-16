import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyGroupTester {
  @Test
  public void myTests() {
    assertTrue(Groups.groupCheck("()"));
    assertFalse(Groups.groupCheck("({"));
  }
}
