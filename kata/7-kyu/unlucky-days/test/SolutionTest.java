import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, Kata.unluckyDays(2015));
    assertEquals(1, Kata.unluckyDays(1986));
  }
}
