import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumberTest {
  @Test
  public void test() {
    assertTrue(Number.isEven(0));
    assertFalse(Number.isEven(0.5));
    assertFalse(Number.isEven(1));
    assertTrue(Number.isEven(2));
    assertTrue(Number.isEven(-4));
  }
}
