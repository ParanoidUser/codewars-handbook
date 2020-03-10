import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(3, Kata.divisibleCount(6, 11, 2));
    assertEquals(0, Kata.divisibleCount(20, 20, 8));
  }
}
