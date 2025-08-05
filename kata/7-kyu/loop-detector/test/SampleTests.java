import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void cyclic() {
    assertTrue(Kata.hasLoop(new int[]{0}));
    assertTrue(Kata.hasLoop(new int[]{1, 0}));
    assertTrue(Kata.hasLoop(new int[]{2, 0, 1, 5}));
    assertTrue(Kata.hasLoop(new int[]{1, 2, 3, 4, 2}));
  }

  @Test
  void acyclic() {
    assertFalse(Kata.hasLoop(new int[0]));
    assertFalse(Kata.hasLoop(new int[]{3, 2, 1, 4}));
    assertFalse(Kata.hasLoop(new int[]{1, 2, 3, 4, 5}));
  }
}