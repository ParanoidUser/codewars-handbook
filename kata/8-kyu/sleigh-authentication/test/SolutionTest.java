import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Sleigh.authenticate("Santa Claus", "Ho Ho Ho!"));
    assertFalse(Sleigh.authenticate("Santa", "Ho Ho Ho!"));
    assertFalse(Sleigh.authenticate("Santa Claus", "Ho Ho Ho"));
  }
}
