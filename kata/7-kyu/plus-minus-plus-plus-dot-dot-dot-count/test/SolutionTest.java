import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Solution.signChange(new int[] {1, 3, 4, 5}));
    assertEquals(2, Solution.signChange(new int[] {1, -3, -4, 0, 5}));
    assertEquals(3, Solution.signChange(new int[] {-47, 84, -30, -11, -5, 74, 77}));
    assertEquals(0, Solution.signChange(new int[0]));
  }
}
