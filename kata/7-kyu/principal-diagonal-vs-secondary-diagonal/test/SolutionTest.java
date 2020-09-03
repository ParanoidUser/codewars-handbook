import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Secondary Diagonal win!", Solution.diagonal(
        new int[][]{
            {2, 2, 2},
            {4, 2, 6},
            {8, 8, 2}
        }));
    assertEquals("Principal Diagonal win!", Solution.diagonal(
        new int[][]{
            {2, 2, 2},
            {4, 2, 6},
            {1, 8, 2}
        }));
    assertEquals("Draw!", Solution.diagonal(
        new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }));
  }
}
