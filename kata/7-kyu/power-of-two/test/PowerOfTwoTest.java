import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PowerOfTwoTest {
  @Test
  void positive() {
    assertTrue(PowerOfTwo.isPowerOfTwo(2));
    assertTrue(PowerOfTwo.isPowerOfTwo(4096));
  }

  @Test
  void negative() {
    assertFalse(PowerOfTwo.isPowerOfTwo(333));
    assertFalse(PowerOfTwo.isPowerOfTwo(0));
  }
}