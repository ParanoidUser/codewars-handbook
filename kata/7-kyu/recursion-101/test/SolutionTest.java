import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{6, 7}, Solution.solve(6, 19));
    assertArrayEquals(new int[]{0, 1}, Solution.solve(2, 1));
    assertArrayEquals(new int[]{0, 1}, Solution.solve(22, 5));
    assertArrayEquals(new int[]{2, 2}, Solution.solve(2, 10));
    assertArrayEquals(new int[]{1019, 1442}, Solution.solve(8796203, 7556));
    assertArrayEquals(new int[]{19394, 19394}, Solution.solve(19394, 19394));
  }
}