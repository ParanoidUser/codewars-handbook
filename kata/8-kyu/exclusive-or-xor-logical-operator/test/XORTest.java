import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class XORTest {
  @Test
  void sample() {
    assertFalse(XOR.xor(false, false));
    assertTrue(XOR.xor(true, false));
    assertTrue(XOR.xor(false, true));
    assertFalse(XOR.xor(true, true));
  }
}
