import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void simpleTest() {
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, Sequence.reverse(5));
  }
}
