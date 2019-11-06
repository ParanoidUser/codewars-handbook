import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(1, Kata.find_average(new int[] {1, 1, 1}), 1e-15);
    assertEquals(2, Kata.find_average(new int[] {1, 2, 3}), 1e-15);
  }
}
