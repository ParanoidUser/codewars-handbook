import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Kata.pillars(1, 10, 10));
    assertEquals(2000, Kata.pillars(2, 20, 25));
    assertEquals(15270, Kata.pillars(11, 15, 30));
  }
}