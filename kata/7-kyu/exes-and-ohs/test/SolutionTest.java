import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(XO.getXO("xxxooo"));
    assertTrue(XO.getXO("xxxXooOo"));
    assertFalse(XO.getXO("xxx23424esdsfvxXXOOooo"));
    assertFalse(XO.getXO("xXxxoewrcoOoo"));
    assertFalse(XO.getXO("XxxxooO"));
    assertTrue(XO.getXO("zssddd"));
    assertFalse(XO.getXO("Xxxxertr34"));
  }
}
