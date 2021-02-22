import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Kata.searchLostNumber(new int[]{-1, 3, 5, 7}));
    assertEquals(9, Kata.searchLostNumber(new int[]{1, 3, 5, 7}));
    assertEquals(21, Kata.searchLostNumber(new int[]{5, 9, 13, 17, 25, 29}));
    assertEquals(0, Kata.searchLostNumber(new int[]{4, 3, 2, 1}));
    assertEquals(30, Kata.searchLostNumber(new int[]{100, 90, 80, 70, 60, 50, 40, 20, 10, 0}));
  }
}