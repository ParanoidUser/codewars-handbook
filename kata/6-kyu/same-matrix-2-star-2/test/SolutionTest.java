import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Solution.count_different_matrices(new int[][]{
        {1, 2, 3, 4},
        {3, 1, 4, 2},
        {4, 3, 2, 1},
        {2, 4, 1, 3}}));

    assertEquals(1, Solution.count_different_matrices(new int[][]{
        {3, 1, 2, 3},
        {3, 1, 2, 3},
        {1, 3, 3, 2},
        {3, 2, 1, 3}}));

    assertEquals(2, Solution.count_different_matrices(new int[][]{
        {5, 1, 2, 6},
        {5, 4, 3, 5},
        {2, 5, 6, 1}}));

    assertEquals(2, Solution.count_different_matrices(new int[][]{
        {1, 2, 2, 1},
        {1, 1, 2, 2},
        {2, 1, 1, 2},
        {2, 1, 2, 1},
        {1, 2, 1, 2}}));
  }
}