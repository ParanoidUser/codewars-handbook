import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals(5, Kata.lostSheeps(new int[] {1, 2}, new int[] {3, 4}, 15));
    assertEquals(6, Kata.lostSheeps(new int[] {3, 1, 2}, new int[] {4, 5}, 21));
  }
}
