import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CalculatorTest {
  @Test
  void sample() {
    assertEquals(11.2, Calculator.calculate(3.2, "+", 8), 0.01);
    assertEquals(-3, Calculator.calculate(-3, "+", 0), 0.01);
    assertEquals(-4.8, Calculator.calculate(3.2, "-", 8), 0.01);
    assertEquals(-3, Calculator.calculate(-3, "-", 0), 0.01);
    assertEquals(0.4, Calculator.calculate(3.2, "/", 8), 0.01);
    assertEquals(1, Calculator.calculate(-2, "/", -2), 0.01);
    assertEquals(25.6, Calculator.calculate(3.2, "*", 8), 0.01);
    assertEquals(0, Calculator.calculate(-3, "*", 0), 0.01);
    assertNull(Calculator.calculate(-3, "/", 0));
    assertNull(Calculator.calculate(-3, "w", 0));
  }
}
