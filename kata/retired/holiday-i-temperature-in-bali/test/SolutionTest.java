import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Bali.bearable(32, 0.01));
    assertTrue(Bali.bearable(25, 0.5));
    assertFalse(Bali.bearable(27, 0.41));
    assertFalse(Bali.bearable(12, 0.99));
    assertFalse(Bali.bearable(40, 0.3));
    assertFalse(Bali.bearable(40, 1.0));
  }
}
