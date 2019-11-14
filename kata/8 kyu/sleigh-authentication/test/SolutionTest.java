import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
  @Test
  public void test_authentication() {
    assertTrue(Sleigh.authenticate("Santa Claus", "Ho Ho Ho!"));
    assertFalse(Sleigh.authenticate("Santa", "Ho Ho Ho!"));
    assertFalse(Sleigh.authenticate("Santa Claus", "Ho Ho Ho"));
  }
}
