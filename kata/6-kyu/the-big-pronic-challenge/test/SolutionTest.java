import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void individualPronicTests() {
    assertTrue(Kata.isPronic(0));
    assertTrue(Kata.isPronic(2));
    assertTrue(Kata.isPronic(6));
    assertTrue(Kata.isPronic(12));
    assertTrue(Kata.isPronic(20));
    assertTrue(Kata.isPronic(30));
    assertTrue(Kata.isPronic(42));
    assertTrue(Kata.isPronic(9223372033963249500L));
    assertFalse(Kata.isPronic(1));
    assertFalse(Kata.isPronic(Long.MIN_VALUE));
    assertFalse(Kata.isPronic(Long.MIN_VALUE / 2));
    assertFalse(Kata.isPronic(Long.MAX_VALUE));
  }
}
