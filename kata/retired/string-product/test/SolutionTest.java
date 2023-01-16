import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Zero.isZero("0"));
    assertTrue(Zero.isZero("0*4"));
    assertTrue(Zero.isZero("17*41*886*9,422,000*0*e*pi"));
    assertFalse(Zero.isZero(""));
  }
}