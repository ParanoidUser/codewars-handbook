import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(5, Kata.lostSheeps(new int[]{1, 2}, new int[]{3, 4}, 15));
    assertEquals(6, Kata.lostSheeps(new int[]{3, 1, 2}, new int[]{4, 5}, 21));
  }
}
