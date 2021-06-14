import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void fixedTestsNegative() {
    assertNull(Kata.center(new int[0][0]));
    assertNull(Kata.center(new int[3][0]));
    assertNull(Kata.center(new int[][]{{5, 1, 3}, {7, 4, 5}}));
    assertNull(Kata.center(new int[][]{{5, 1}, {3, 7}, {4, 5}}));
    assertNull(Kata.center(new int[][]{{5, 1}, {6, 2}, {7, 4}, {1, 3}}));
  }

  @Test
  void fixedTestsPositive() {
    assertEquals(3, Kata.center(new int[][]{{3}}));
    assertEquals(1, Kata.center(new int[][]{{5, 1, 3}}));
    assertEquals(1, Kata.center(new int[][]{{5}, {1}, {3}}));
    assertEquals(2, Kata.center(new int[][]{{5, 1, 3}, {6, 2, 6}, {7, 4, 5}}));
    assertEquals(4, Kata.center(new int[][]{{5, 1, 3}, {6, 2, 6}, {7, 4, 5}, {10, 12, 12}, {14, 0, 0}}));
  }
}
