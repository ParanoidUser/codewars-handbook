import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EightiesKids4Test {
  @Test
  void sample() {
    assertEquals("X                   X\n  X               X\n    X           X\n      X       X\n        X   X\n          X\n        X   X\n      X       X\n    X           X\n  X               X\nX                   X\n", EightiesKids4.markSpot(11));
    assertEquals("X       X\n  X   X\n    X\n  X   X\nX       X\n", EightiesKids4.markSpot(5));
    assertEquals("X\n", EightiesKids4.markSpot(1));
    assertEquals("?", EightiesKids4.markSpot(-1));
    assertEquals("?", EightiesKids4.markSpot(4));
    assertEquals("?", EightiesKids4.markSpot(.5f));
  }
}
