import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new int[] {2, 9, 3, 49, 4, 1}, Kata.squareOrSquareRoot(new int[] {4, 3, 9, 7, 2, 1}));
    assertArrayEquals(new int[] {10, 10201, 25, 25, 1, 1}, Kata.squareOrSquareRoot(new int[] {100, 101, 5, 5, 1, 1}));
    assertArrayEquals(new int[] {1, 4, 9, 2, 25, 36}, Kata.squareOrSquareRoot(new int[] {1, 2, 3, 4, 5, 6}));
  }
}
