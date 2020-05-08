import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FactorTest {
  @Test
   void sample() {
    assertTrue(Kata.checkForFactor(10, 2));
    assertTrue(Kata.checkForFactor(63, 7));
    assertTrue(Kata.checkForFactor(2450, 5));
    assertTrue(Kata.checkForFactor(24612, 3));
    assertFalse(Kata.checkForFactor(63, 2));
    assertFalse(Kata.checkForFactor(2450, 13));
    assertFalse(Kata.checkForFactor(24612, 8));
  }
}
