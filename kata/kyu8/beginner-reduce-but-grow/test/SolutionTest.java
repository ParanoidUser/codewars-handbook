import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(6, Kata.grow(new int[] {1, 2, 3}));
    assertEquals(16, Kata.grow(new int[] {4, 1, 1, 1, 4}));
    assertEquals(64, Kata.grow(new int[] {2, 2, 2, 2, 2, 2}));
  }
}
