import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sample_Tests() {
    Counter mycounter = new Counter();
    mycounter.increment();
    mycounter.increment();
    assertEquals(2, mycounter.check());
  }
}
