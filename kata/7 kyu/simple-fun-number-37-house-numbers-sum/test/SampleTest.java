import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals(11, Kata.houseNumbersSum(new int[] {5, 1, 2, 3, 0, 1, 5, 0, 2}));
    assertEquals(13, Kata.houseNumbersSum(new int[] {4, 2, 1, 6, 0}));
    assertEquals(10, Kata.houseNumbersSum(new int[] {4, 1, 2, 3, 0, 10, 2}));
    assertEquals(0, Kata.houseNumbersSum(new int[] {0, 1, 2, 3, 4, 5}));
  }
}
