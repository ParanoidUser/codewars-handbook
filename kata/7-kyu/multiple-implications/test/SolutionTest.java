import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertFalse(Logic.multImplication(new boolean[]{}));
    assertFalse(Logic.multImplication(new boolean[]{false}));
    assertTrue(Logic.multImplication(new boolean[]{true}));
    assertTrue(Logic.multImplication(new boolean[]{false, false}));
    assertTrue(Logic.multImplication(new boolean[]{false, true}));
    assertFalse(Logic.multImplication(new boolean[]{true, false}));
    assertTrue(Logic.multImplication(new boolean[]{true, true}));
    assertFalse(Logic.multImplication(new boolean[]{false, false, false}));
    assertTrue(Logic.multImplication(new boolean[]{false, false, true}));
    assertFalse(Logic.multImplication(new boolean[]{false, true, false}));
    assertTrue(Logic.multImplication(new boolean[]{false, true, true}));
    assertTrue(Logic.multImplication(new boolean[]{true, false, false}));
    assertTrue(Logic.multImplication(new boolean[]{true, false, true}));
    assertFalse(Logic.multImplication(new boolean[]{true, true, false}));
    assertTrue(Logic.multImplication(new boolean[]{true, true, true}));
  }
}
