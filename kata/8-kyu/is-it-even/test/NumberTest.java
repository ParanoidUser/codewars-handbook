import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NumberTest {
  @Test
  void sample() {
    assertTrue(new Number().isEven(0));
    assertFalse(new Number().isEven(0.5));
    assertFalse(new Number().isEven(1));
    assertTrue(new Number().isEven(2));
    assertTrue(new Number().isEven(-4));
  }
}
