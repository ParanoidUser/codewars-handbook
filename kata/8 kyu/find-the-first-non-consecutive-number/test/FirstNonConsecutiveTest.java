import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public final class FirstNonConsecutiveTest {
  @Test
  public void basicTests() {
    assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[] {1, 2, 3, 4, 6, 7, 8}));
    assertNull(FirstNonConsecutive.find(new int[] {1, 2, 3, 4, 5, 6, 7, 8}));
    assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[] {4, 6, 7, 8, 9, 11}));
    assertEquals(Integer.valueOf(11), FirstNonConsecutive.find(new int[] {4, 5, 6, 7, 8, 9, 11}));
    assertNull(FirstNonConsecutive.find(new int[] {31, 32}));
    assertEquals(Integer.valueOf(0), FirstNonConsecutive.find(new int[] {-3, -2, 0, 1}));
    assertEquals(Integer.valueOf(-1), FirstNonConsecutive.find(new int[] {-5, -4, -3, -1}));
  }
}
