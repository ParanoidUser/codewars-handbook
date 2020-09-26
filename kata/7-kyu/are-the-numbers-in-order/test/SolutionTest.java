import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.isAscOrder(new int[]{1, 2}));
    assertFalse(Solution.isAscOrder(new int[]{2, 1}));
    assertTrue(Solution.isAscOrder(new int[]{1, 2, 3}));
    assertFalse(Solution.isAscOrder(new int[]{1, 3, 2}));
    assertTrue(Solution.isAscOrder(new int[]{1, 4, 13, 97, 508, 1047, 20058}));
    assertFalse(Solution.isAscOrder(new int[]{56, 98, 123, 67, 742, 1024, 32, 90969}));
  }
}
