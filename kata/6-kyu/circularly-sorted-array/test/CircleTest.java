import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CircleTest {
  @Test
  void sample() {
    assertTrue(new CircleSorted().isCircleSorted(new int[]{3, 0, 1, 2}));
    assertFalse(new CircleSorted().isCircleSorted(new int[]{9, 10, 14, 12}));
  }
}
