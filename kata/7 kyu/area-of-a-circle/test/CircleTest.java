import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidRadius() {
    Circle.area(0);
  }

  @Test
  public void testKnownValues() {
    for (int i = 0; i < 3; i++) {
      assertEquals(28.27D, Circle.area(3.), 0.01);
    }
  }
}
