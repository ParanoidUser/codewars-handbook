import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StairTests {
  @Test
  public void test() {
    assertEquals(6, Stairs.NumberOfSteps(10, 2));
    assertEquals(-1, Stairs.NumberOfSteps(3, 5));
  }
}
