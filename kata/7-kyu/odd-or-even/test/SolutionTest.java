import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("odd", Codewars.oddOrEven(new int[] {2, 5, 34, 6}));
    assertEquals("even", Codewars.oddOrEven(new int[] {2, 5, 34, 5}));
  }
}
