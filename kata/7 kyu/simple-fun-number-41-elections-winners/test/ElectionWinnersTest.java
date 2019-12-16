import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElectionWinnersTest {
  @Test
  public void basicTests() {
    assertEquals(2, ElectionWinners.find(new int[] {2, 3, 5, 2}, 3));
    assertEquals(0, ElectionWinners.find(new int[] {1, 3, 3, 1, 1}, 0));
    assertEquals(1, ElectionWinners.find(new int[] {5, 1, 3, 4, 1}, 0));
    assertEquals(4, ElectionWinners.find(new int[] {1, 1, 1, 1}, 1));
    assertEquals(0, ElectionWinners.find(new int[] {1, 1, 1, 1}, 0));
    assertEquals(2, ElectionWinners.find(new int[] {3, 1, 1, 3, 1}, 2));
  }
}
