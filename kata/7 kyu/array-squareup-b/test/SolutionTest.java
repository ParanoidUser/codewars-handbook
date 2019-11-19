import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new int[] {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}, Kata.squareUp(4));
    assertArrayEquals(new int[] {
          0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 3, 2, 1, 0, 0, 0,
          0, 0, 4, 3, 2, 1, 0, 0, 0, 0, 5, 4, 3, 2, 1, 0, 0, 0, 6, 5, 4, 3, 2, 1, 0, 0, 7, 6, 5, 4,
          3, 2, 1, 0, 8, 7, 6, 5, 4, 3, 2, 1, 9, 8, 7, 6, 5, 4, 3, 2, 1
        },Kata.squareUp(9));
    assertArrayEquals(new int[] {1}, Kata.squareUp(1));
  }
}
