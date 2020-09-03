import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FunctionalProgrammingTest {
  @Test
  void sample() {
    Triangle t = new Triangle(5, 10);
    assertEquals(25, FunctionalProgramming.f.applyAsDouble(t), .001);
    assertEquals(25, t.getArea(), .001);
  }
}
