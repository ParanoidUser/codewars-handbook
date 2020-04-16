import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FactorTest {
  @Test
  public void basicTests() {
    assertTrue(Kata.checkForFactor(10, 2));
    assertTrue(Kata.checkForFactor(63, 7));
    assertTrue(Kata.checkForFactor(2450, 5));
    assertTrue(Kata.checkForFactor(24612, 3));
  }
}
