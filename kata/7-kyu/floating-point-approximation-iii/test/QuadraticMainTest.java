import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QuadraticMainTest {
  @Test
  void sample() {
    assertEquals(-2.0E-13, Quadratic.quadratic(7, 4.00e+13, 8));
    assertEquals(-1.0E-14, Quadratic.quadratic(9, 1.00e+14, 1));
    assertEquals(-3.333333333333333E-10, Quadratic.quadratic(3, 3.00e+09, 1));
    assertEquals(-1.75E-9, Quadratic.quadratic(7, 4.00e+09, 7));
  }
}
