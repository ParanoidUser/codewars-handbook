import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals(21, Kata.shortestTime(new int[] {3, 4, 5, 6}));
    assertEquals(41, Kata.shortestTime(new int[] {3, 7, 10, 18}));
    assertEquals(27, Kata.shortestTime(new int[] {5, 5, 6, 7}));
    assertEquals(63, Kata.shortestTime(new int[] {5, 6, 30, 40}));
  }
}
