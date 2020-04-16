import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PangramTest {
  @Test
  public void test1() {
    assertTrue(PangramChecker.check("The quick brown fox jumps over the lazy dog."));
  }

  @Test
  public void test2() {
    assertFalse(PangramChecker.check("You shall not pass!"));
  }
}
