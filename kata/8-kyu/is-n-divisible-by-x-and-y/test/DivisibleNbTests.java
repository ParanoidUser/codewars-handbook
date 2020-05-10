import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DivisibleNbTests {
  @Test
  void sample() {
    assertTrue(DivisibleNb.isDivisible(12, 4, 3));
    assertFalse(DivisibleNb.isDivisible(3, 3, 4));
    assertFalse(DivisibleNb.isDivisible(3, 4, 3));
    assertFalse(DivisibleNb.isDivisible(3, 4, 4));
  }
}
