import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Kata.swapAdjacentBits(0));
    assertEquals(2, Kata.swapAdjacentBits(1));
    assertEquals(14, Kata.swapAdjacentBits(13));
    assertEquals(133, Kata.swapAdjacentBits(74));
    assertEquals(166680, Kata.swapAdjacentBits(83748));
    assertEquals(1073741823, Kata.swapAdjacentBits(1073741823));
  }
}