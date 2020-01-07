import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectTest {
  @Test
  public void shouldWorkWith4x4() {
    assertEquals("100", 100, Solution.numberOfRectangles(4, 4));
  }

  @Test
  public void shouldWorkWith5x5() {
    assertEquals("225", 225, Solution.numberOfRectangles(5, 5));
  }
}
