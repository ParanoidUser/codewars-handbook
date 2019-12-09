import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MatrixAdditionTest {
  @Test
  public void sampleTest() {
    int[][] expected = new int[][] {{3, 4, 4}, {6, 4, 4}, {2, 2, 4}};
    assertArrayEquals(expected, Kata.matrixAddition(new int[][] {{1, 2, 3}, {3, 2, 1}, {1, 1, 1}}, new int[][] {{2, 2, 1}, {3, 2, 3}, {1, 1, 3}}));

    expected = new int[][] {{3}};
    assertArrayEquals(expected, Kata.matrixAddition(new int[][] {{1}}, new int[][] {{2}}));

    expected = new int[][] {{3, 5}, {3, 5}};
    assertArrayEquals(expected, Kata.matrixAddition(new int[][] {{1, 2}, {1, 2}}, new int[][] {{2, 3}, {2, 3}}));
  }
}
