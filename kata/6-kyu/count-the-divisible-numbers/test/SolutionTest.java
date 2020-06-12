import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, Kata.divisibleCount(6, 11, 2));
    assertEquals(0, Kata.divisibleCount(20, 20, 8));
  }
}
