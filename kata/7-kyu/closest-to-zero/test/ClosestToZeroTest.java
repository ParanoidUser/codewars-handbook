import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class ClosestToZeroTest {
  @Test
  void sample() {
    assertEquals(Integer.valueOf(1), ClosestToZero.find(new int[]{10, 3, 9, 1}));
    assertEquals(Integer.valueOf(-1), ClosestToZero.find(new int[]{2, 4, -1, -3}));
    assertEquals(Integer.valueOf(0), ClosestToZero.find(new int[]{13, 0, -6}));
    assertEquals(Integer.valueOf(-2147483648), ClosestToZero.find(new int[]{-2147483648}));
    assertNull(ClosestToZero.find(new int[]{5, 1, -1, 2, -10}));
    assertNull(ClosestToZero.find(new int[]{5, 11, 11, 2, -1, 1}));
  }
}
