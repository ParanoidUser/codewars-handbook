import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DivisibleTest {
  @Test
  public void basicTests() {
    assertFalse(Divisible.isDivisible(3, 3, 4));
    assertTrue(Divisible.isDivisible(12, 3, 4));
    assertFalse(Divisible.isDivisible(8, 3, 4, 2, 5));
  }
}
