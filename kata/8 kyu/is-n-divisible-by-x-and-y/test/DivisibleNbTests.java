import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DivisibleNbTests {
  @Test
  public void test1() {
    assertTrue(DivisibleNb.isDivisible(12, 4, 3));
  }

  @Test
  public void test2() {
    assertFalse(DivisibleNb.isDivisible(3, 3, 4));
  }
}
