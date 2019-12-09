import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSequenceTest {
  @Test
  public void testEmptyArray() {
    assertEquals("Empty arrays should have a max of 0", 0, Max.sequence(new int[] {}));
  }

  @Test
  public void testExampleArray() {
    assertEquals("Example array should have a max of 6", 6, Max.sequence(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }
}
