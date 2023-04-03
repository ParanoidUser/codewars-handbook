import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MillipedeTest {
  @Test
  void sample() {
    assertTrue(Millipede.check(new String[]{"cable", "excavate", "example", "endure", "east"}));
    assertTrue(Millipede.check(new String[]{"east", "e", "e", "t", "t", "e", "time"}));
    assertTrue(Millipede.check(new String[]{"screen", "desire", "theater", "excess", "night"}));
    assertTrue(Millipede.check(new String[]{"excavate", "endure", "desire", "screen", "theater", "excess", "night"}));
    assertFalse(Millipede.check(new String[]{"no", "dog", "on", "good"}));
    assertFalse(Millipede.check(new String[]{"cycle", "transport", "elite", "empire", "cable", "effort"}));
    assertFalse(Millipede.check(new String[]{"trade", "pole", "view", "grave", "ladder", "mushroom", "president"}));
  }
}