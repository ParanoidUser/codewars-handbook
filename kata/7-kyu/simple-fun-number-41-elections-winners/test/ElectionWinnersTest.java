import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ElectionWinnersTest {
  @Test
  void sample() {
    assertEquals(2, ElectionWinners.find(new int[] {2, 3, 5, 2}, 3));
    assertEquals(0, ElectionWinners.find(new int[] {1, 3, 3, 1, 1}, 0));
    assertEquals(1, ElectionWinners.find(new int[] {5, 1, 3, 4, 1}, 0));
    assertEquals(4, ElectionWinners.find(new int[] {1, 1, 1, 1}, 1));
    assertEquals(0, ElectionWinners.find(new int[] {1, 1, 1, 1}, 0));
    assertEquals(2, ElectionWinners.find(new int[] {3, 1, 1, 3, 1}, 2));
  }
}
