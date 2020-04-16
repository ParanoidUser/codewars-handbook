import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ClosestToZeroTest {
  @Test
  public void find() {
    assertEquals(Integer.valueOf(1), ClosestToZero.find(new int[] {10, 3, 9, 1}));
    assertEquals(Integer.valueOf(-1), ClosestToZero.find(new int[] {2, 4, -1, -3}));
    assertEquals(Integer.valueOf(0), ClosestToZero.find(new int[] {13, 0, -6}));
  }

  @Test
  public void shouldReturnNone() {
    assertNull(ClosestToZero.find(new int[] {5, 1, -1, 2, -10}));
    assertNull(ClosestToZero.find(new int[] {5, 11, 11, 2, -1, 1}));
  }
}
