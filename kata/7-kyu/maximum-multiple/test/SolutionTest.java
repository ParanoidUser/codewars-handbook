import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void smallPositives() {
    assertEquals("The largest multiple of 2 between 0 and 7 is 6.", 6, MaxMultiple.maxMultiple(2, 7));
    assertEquals("The largest multiple of 3 between 0 and 10 is 9.", 9, MaxMultiple.maxMultiple(3, 10));
    assertEquals("The largest multiple of 7 between 0 and 17 is 14.", 14, MaxMultiple.maxMultiple(7, 17));
  }

  @Test
  public void largerPositives() {
    assertEquals("The largest multiple of 10 between 0 and 50 is 50.", 50, MaxMultiple.maxMultiple(10, 50));
    assertEquals("The largest multiple of 37 between 0 and 200 is 185.", 185, MaxMultiple.maxMultiple(37, 200));
    assertEquals("The largest multiple of 7 between 0 and 100 is 98.", 98, MaxMultiple.maxMultiple(7, 100));
  }
}
