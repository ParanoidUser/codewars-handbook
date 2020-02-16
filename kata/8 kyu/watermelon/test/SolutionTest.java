import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertTrue(Kata.divide(4));
    assertFalse(Kata.divide(2));
    assertFalse(Kata.divide(5));
    assertTrue(Kata.divide(88));
    assertTrue(Kata.divide(100));
    assertFalse(Kata.divide(67));
    assertTrue(Kata.divide(90));
    assertTrue(Kata.divide(10));
    assertFalse(Kata.divide(99));
    assertTrue(Kata.divide(32));
  }
}
