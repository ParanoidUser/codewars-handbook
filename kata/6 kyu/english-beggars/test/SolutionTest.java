import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void tester() {
    int[] test = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[] {15}, Kata.beggars(test, 1));
    assertArrayEquals(new int[] {9, 6}, Kata.beggars(test, 2));
    assertArrayEquals(new int[] {5, 7, 3}, Kata.beggars(test, 3));
    assertArrayEquals(new int[] {1, 2, 3, 4, 5, 0}, Kata.beggars(test, 6));
    assertArrayEquals(new int[0], Kata.beggars(test, 0));
  }
}
