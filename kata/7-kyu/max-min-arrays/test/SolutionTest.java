import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{15, 7, 12, 10, 11}, Solution.solve(new int[]{15, 11, 10, 7, 12}));
    assertArrayEquals(new int[]{15, 7, 12, 10, 11}, Solution.solve(new int[]{15, 11, 10, 7, 12}));
    assertArrayEquals(new int[]{15, 7, 12, 10, 11}, Solution.solve(new int[]{15, 11, 10, 7, 12}));
  }
}