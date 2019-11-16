import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    var arrayOfArrays = new int[][] {new int[] {1, 2, 3, 4, 5, 6}, new int[] {7, 7, 7, 7, 7, 7}};
    assertArrayEquals(new int[] {8, 9, 10, 11, 12, 13}, Kata.addingShifted(arrayOfArrays, 0));

    arrayOfArrays = new int[][] {new int[] {1, 2, 3, 4, 5, 6}, new int[] {7, 7, 7, 7, 7, 7}};
    assertArrayEquals(new int[] {1, 2, 3, 11, 12, 13, 7, 7, 7}, Kata.addingShifted(arrayOfArrays, 3));

    arrayOfArrays = new int[][] {new int[] {1, 2, 3, 4, 5, 6}, new int[] {7, 7, 7, -7, 7, 7}, new int[] {1, 1, 1, 1, 1, 1}};
    assertArrayEquals(new int[] {1, 2, 3, 11, 12, 13, -6, 8, 8, 1, 1, 1}, Kata.addingShifted(arrayOfArrays, 3));
  }
}
