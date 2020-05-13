import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.zeroFuel(50, 25, 2));
    assertFalse(Kata.zeroFuel(100, 50, 1));
  }
}
