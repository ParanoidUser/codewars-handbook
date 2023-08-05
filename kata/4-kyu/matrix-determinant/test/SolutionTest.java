import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Matrix.determinant(new int[][]{{1}}));
    assertEquals(-1, Matrix.determinant(new int[][]{{1, 3}, {2, 5}}));
    assertEquals(-20, Matrix.determinant(new int[][]{{2, 5, 3}, {1, -2, -1}, {1, 3, 4}}));
  }
}