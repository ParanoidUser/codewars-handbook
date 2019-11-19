import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    Generator g = new Generator();
    assertEquals(g.next(), 1);
    assertEquals(g.next(), 2);
    assertEquals(g.next(), 3);
    assertEquals(g.next(), 4);
    assertEquals(g.next(), 5);
    assertEquals(g.next(10), 10);
  }
}
