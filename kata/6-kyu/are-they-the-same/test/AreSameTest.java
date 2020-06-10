import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AreSameTest {
  @Test
  void sample() {
    assertTrue(AreSame.comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
    assertFalse(AreSame.comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736}));
    assertFalse(AreSame.comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, null));
  }
}
