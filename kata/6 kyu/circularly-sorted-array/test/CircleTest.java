import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CircleTest {
  @Test
  public void testTrue() {
    assertTrue(CircleSorted.isCircleSorted(new int[] {3, 0, 1, 2}));
  }

  @Test
  public void testFalse() {
    assertFalse(CircleSorted.isCircleSorted(new int[] {9, 10, 14, 12}));
  }
}
