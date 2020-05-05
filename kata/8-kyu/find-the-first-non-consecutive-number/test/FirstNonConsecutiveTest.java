import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class FirstNonConsecutiveTest {
  @Test
  void sample() {
    assertNull(FirstNonConsecutive.find(new int[]{31, 32}));
    assertNull(FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    assertEquals(Integer.valueOf(0), FirstNonConsecutive.find(new int[]{-3, -2, 0, 1}));
    assertEquals(Integer.valueOf(-1), FirstNonConsecutive.find(new int[]{-5, -4, -3, -1}));
    assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{4, 6, 7, 8, 9, 11}));
    assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
    assertEquals(Integer.valueOf(11), FirstNonConsecutive.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
  }
}
