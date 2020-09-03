import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestSuitcase {
  @Test
  void sample() {
    assertTrue(MrSquare.fit_in(1, 2, 3, 2));
    assertFalse(MrSquare.fit_in(1, 2, 2, 1));
    assertFalse(MrSquare.fit_in(3, 2, 3, 2));
    assertFalse(MrSquare.fit_in(1, 2, 1, 2));
    assertFalse(MrSquare.fit_in(6, 5, 8, 7));
    assertFalse(MrSquare.fit_in(4, 1, 5, 3));
  }
}
