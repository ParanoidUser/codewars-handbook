import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AbundantTests {
  @Test
  void sample() {
    assertTrue(Kata.abundantNumber(12));
    assertTrue(Kata.abundantNumber(18));
    assertFalse(Kata.abundantNumber(37));
    assertFalse(Kata.abundantNumber(77));
  }
}
