import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(12, Diagonal.diagonalSum(new int[][]{{12}}));
    assertEquals(5, Diagonal.diagonalSum(new int[][]{{1, 2}, {3, 4}}));
    assertEquals(15, Diagonal.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    assertEquals(34, Diagonal.diagonalSum(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));
  }
}
