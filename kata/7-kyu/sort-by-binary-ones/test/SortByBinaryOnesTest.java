import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortByBinaryOnesTest {
  @Test
  public void testSort() {
    assertArrayEquals(SortByBinaryOnes.sort(new Integer[] {1, 3}), new Integer[] {3, 1});
    assertArrayEquals(SortByBinaryOnes.sort(new Integer[] {1, 2, 3, 4}), new Integer[] {3, 1, 2, 4});
  }
}
