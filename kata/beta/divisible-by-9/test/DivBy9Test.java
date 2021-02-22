import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DivBy9Test {
  @Test
  void sample() {
    assertTrue(DivBy9.check("0"));
    assertTrue(DivBy9.check("9"));
    assertFalse(DivBy9.check("7"));
    assertTrue(DivBy9.check("777777777777777777777777777777777777777777777"));
  }
}