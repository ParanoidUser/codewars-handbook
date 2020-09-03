import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, Kata.stantonMeasure(new int[] {1, 4, 3, 2, 1, 2, 3, 2}));
  }
}
