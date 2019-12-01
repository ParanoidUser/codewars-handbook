import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void test0() {
    assertArrayEquals(new int[] {1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9}, JomoPipi.sequence(16));
  }

  @Test
  public void test1() {
    assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, JomoPipi.sequence(9));
  }
}
