import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void simpleTest() {
    assertEquals("Secondary Diagonal win!", Solution.diagonal(
            new int[][] {
              {2, 2, 2},
              {4, 2, 6},
              {8, 8, 2}
            }));
    assertEquals("Principal Diagonal win!", Solution.diagonal(
            new int[][] {
              {2, 2, 2},
              {4, 2, 6},
              {1, 8, 2}
            }));
    assertEquals("Draw!", Solution.diagonal(
            new int[][] {
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}
            }));
  }
}
