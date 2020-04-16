import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new double[] {2, 2, 2, 2}, Kata.averages(new int[] {2, 2, 2, 2, 2}));
    assertArrayEquals(new double[] {0, 0, 0, 0}, Kata.averages(new int[] {2, -2, 2, -2, 2}));
    assertArrayEquals(new double[] {2, 4, 3, -4.5}, Kata.averages(new int[] {1, 3, 5, 1, -10}));
  }
}
