import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Alive!", SharkPontoon.shark(7, 8, 3, 4, true));
    assertEquals("Alive!", SharkPontoon.shark(12, 50, 4, 8, true));
    assertEquals("Alive!", SharkPontoon.shark(7, 55, 4, 16, true));
    assertEquals("Shark Bait!", SharkPontoon.shark(24, 0, 4, 8, true));
    assertEquals("Shark Bait!", SharkPontoon.shark(48, 183, 3, 16, false));
  }
}
