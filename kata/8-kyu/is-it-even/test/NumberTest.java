import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NumberTest {
  @Test
  void sample() {
    assertTrue(Number.isEven(0));
    assertFalse(Number.isEven(0.5));
    assertFalse(Number.isEven(1));
    assertTrue(Number.isEven(2));
    assertTrue(Number.isEven(-4));
  }
}
