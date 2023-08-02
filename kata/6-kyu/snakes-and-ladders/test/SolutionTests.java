import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTests {
  @Test
  void sample() {
    assertEquals(10, Dinglemouse.snakesAndLadders(new int[]{0, 0, 3, 0, 0, 0, 0, -2, 0, 0, 0}, new int[]{2, 1, 5, 1, 5, 4}));
  }
}