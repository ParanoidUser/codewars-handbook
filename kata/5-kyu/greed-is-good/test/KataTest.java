import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals(250, Greed.greedy(new int[]{5, 1, 3, 4, 1}));
    assertEquals(450, Greed.greedy(new int[]{2, 4, 4, 5, 4}));
    assertEquals(1100, Greed.greedy(new int[]{1, 1, 1, 3, 1}));
  }
}