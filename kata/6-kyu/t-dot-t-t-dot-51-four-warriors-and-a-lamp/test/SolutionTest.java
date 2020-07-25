import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(21, Kata.shortestTime(new int[]{3, 4, 5, 6}));
    assertEquals(41, Kata.shortestTime(new int[]{3, 7, 10, 18}));
    assertEquals(27, Kata.shortestTime(new int[]{5, 5, 6, 7}));
    assertEquals(63, Kata.shortestTime(new int[]{5, 6, 30, 40}));
  }
}
