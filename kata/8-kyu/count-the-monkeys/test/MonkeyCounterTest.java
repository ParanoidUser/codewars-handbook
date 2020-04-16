import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MonkeyCounterTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new int[] {1, 2, 3, 4, 5}, MonkeyCounter.monkeyCount(5));
    assertArrayEquals(new int[] {1, 2, 3}, MonkeyCounter.monkeyCount(3));
    assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, MonkeyCounter.monkeyCount(9));
    assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, MonkeyCounter.monkeyCount(10));
    assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, MonkeyCounter.monkeyCount(20));
  }
}
