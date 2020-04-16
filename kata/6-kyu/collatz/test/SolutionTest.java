import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals("3->10->5->16->8->4->2->1", Collatz.collatz(3));
  }
}
