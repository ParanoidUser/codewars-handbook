import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestSuitcase {
  @Test
  void sample() {
    assertTrue(MrSquare.fitIn(1, 2, 3, 2));
    assertFalse(MrSquare.fitIn(1, 2, 2, 1));
    assertFalse(MrSquare.fitIn(3, 2, 3, 2));
    assertFalse(MrSquare.fitIn(1, 2, 1, 2));
    assertFalse(MrSquare.fitIn(6, 5, 8, 7));
    assertFalse(MrSquare.fitIn(4, 1, 5, 3));
  }
}
