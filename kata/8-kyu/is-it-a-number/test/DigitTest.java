import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DigitTest {
  @Test
  public void test0() {
    assertFalse(MyUtilities.isDigit("s2324"));
  }

  @Test
  public void test1() {
    assertTrue(MyUtilities.isDigit("-234.4"));
  }
}
