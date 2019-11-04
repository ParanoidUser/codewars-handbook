import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals(0, Goals.goals(0, 0, 0));
    assertEquals(58, Goals.goals(43, 10, 5));
  }
}
