import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DivisibleTest {
  @Test
  void sample() {
    assertTrue(Divisible.isDivisible(12, 3, 4));
    assertTrue(Divisible.isDivisible());
    assertFalse(Divisible.isDivisible(3, 3, 4));
    assertFalse(Divisible.isDivisible(3, 0, 4));
    assertFalse(Divisible.isDivisible(8, 3, 4, 2, 5));
  }
}
