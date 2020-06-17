import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TriangleFactorsTest {
  @Test
  void sample() {
    TriangleFactors tf = new TriangleFactors();
    assertEquals(3, tf.calculate(1));
    assertEquals(6, tf.calculate(2));
    assertEquals(28, tf.calculate(5));
  }
}