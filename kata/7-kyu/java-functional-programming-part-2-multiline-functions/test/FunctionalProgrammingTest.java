import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FunctionalProgrammingTest {
  @Test
  public void testArea() {
    Triangle t = new Triangle(5, 10);
    assertEquals("Incorrect area returned", 25, FunctionalProgramming.f.applyAsDouble(t), .001);
    assertEquals("Incorrect area in Triangle object", 25, t.getArea(), .001);
  }
}
