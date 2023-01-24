import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(new Ship(40, 5).isWorthIt());
    assertFalse(new Ship(0, 0).isWorthIt());
  }
}