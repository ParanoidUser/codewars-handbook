import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AbundantTests {
  @Test
  public void testAbundant() {
    assertTrue(Kata.abundantNumber(12));
    assertTrue(Kata.abundantNumber(18));
  }

  @Test
  public void testNonAbundant() {
    assertFalse(Kata.abundantNumber(37));
    assertFalse(Kata.abundantNumber(77));
  }
}
