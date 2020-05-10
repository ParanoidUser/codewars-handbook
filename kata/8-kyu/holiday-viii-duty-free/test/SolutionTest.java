import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(166, Kata.dutyFree(12, 50, 1000));
    assertEquals(294, Kata.dutyFree(17, 10, 500));
    assertEquals(357, Kata.dutyFree(24, 35, 3000));
    assertEquals(20, Kata.dutyFree(1400, 35, 10000));
    assertEquals(38, Kata.dutyFree(700, 26, 7000));
  }
}
