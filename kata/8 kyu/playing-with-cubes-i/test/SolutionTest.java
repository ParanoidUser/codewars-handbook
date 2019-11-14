import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSetToThree() {
    Cube c = new Cube();
    c.setSide(3);
    assertEquals(3, c.getSide());
  }
}
