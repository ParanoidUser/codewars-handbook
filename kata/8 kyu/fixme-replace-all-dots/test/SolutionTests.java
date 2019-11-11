import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTests {
  @Test
  public void testSomeDots() {
    assertEquals("Sorry, try again :-(", "one-two-three", Dinglemouse.replaceDots("one.two.three"));
  }
}
