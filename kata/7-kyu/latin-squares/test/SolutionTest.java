import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{{1}}, LatinSquares.makeLatinSquare(1));
    assertArrayEquals(new int[][]{{1, 2}, {2, 1}}, LatinSquares.makeLatinSquare(2));
    assertArrayEquals(new int[][]{{1, 2, 3}, {2, 3, 1}, {3, 1, 2}}, LatinSquares.makeLatinSquare(3));
    assertArrayEquals(new int[][]{{1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}}, LatinSquares.makeLatinSquare(4));
  }
}