import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    Generator g = new Generator();
    assertEquals(1,g.next());
    assertEquals(2,g.next());
    assertEquals(3,g.next());
    assertEquals(4,g.next());
    assertEquals(5,g.next());
    assertEquals(10, g.next(10));
  }
}
