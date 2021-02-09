import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, Kata.fourSeven(7));
    assertEquals(7, Kata.fourSeven(4));
    assertEquals(0, Kata.fourSeven(15));
  }
}
