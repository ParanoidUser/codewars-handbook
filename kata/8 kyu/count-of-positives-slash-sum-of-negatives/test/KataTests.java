import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KataTests {
  @Test
  public void countPositivesSumNegatives_BasicTest() {
    assertArrayEquals(new int[] {10, -65}, Kata.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
  }

  @Test
  public void countPositivesSumNegatives_InputWithZeroes() {
    assertArrayEquals(new int[] {8, -50}, Kata.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
  }
}
