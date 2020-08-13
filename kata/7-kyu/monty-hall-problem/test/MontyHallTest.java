import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MontyHallTest {
  @Test
  void sample() {
    assertEquals(71, new MontyHall().montyHallCase(1, new int[] {3, 3, 2, 3, 3, 2, 2, 3, 2, 2, 1, 1, 1, 1}));
    assertEquals(64, new MontyHall().montyHallCase(2, new int[] {3, 3, 2, 3, 3, 2, 2, 3, 2, 2, 1, 1, 1, 1}));
    assertEquals(64, new MontyHall().montyHallCase(3, new int[] {3, 3, 2, 3, 3, 2, 2, 3, 2, 2, 1, 1, 1, 1}));
  }
}
