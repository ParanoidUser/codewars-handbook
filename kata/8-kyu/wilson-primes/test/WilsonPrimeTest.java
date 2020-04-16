import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WilsonPrimeTest {
  @Test
  public void test1() {
    assertFalse(WilsonPrime.am_i_wilson(0));
  }

  @Test
  public void test2() {
    assertFalse(WilsonPrime.am_i_wilson(1));
  }

  @Test
  public void test3() {
    assertTrue(WilsonPrime.am_i_wilson(5));
  }
}
