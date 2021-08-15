import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.all(new int[]{}, n -> n != 0));
    assertTrue(Solution.all(new int[]{2, 4, 6, 10}, n -> n % 2 == 0));
    assertFalse(Solution.all(new int[]{1, 3, 5, 10}, n -> n % 2 != 0));
    assertFalse(Solution.all(new int[]{2, 4, 6, 19}, n -> n < 10));
    assertTrue(Solution.all(new int[]{1, 1, 2}, n -> n < 5));
    assertTrue(Solution.all(new int[]{2, 9, 4, 3}, n -> n > 1));
    assertFalse(Solution.all(new int[]{2, 9, 4, 0}, n -> n > 1));
    assertFalse(Solution.all(new int[]{5, 6, 7, 8}, n -> n < 5));
    assertTrue(Solution.all(new int[]{13, 42}, n -> n > 10));
  }
}