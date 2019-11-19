import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
  @Test
  public void basicTest() {
    assertEquals("3.2 + 8 = 11.2", 11.2, Calculator.calculate(3.2, "+", 8), 0.01);
    assertEquals("3.2 - 8 = -4.8", -4.8, Calculator.calculate(3.2, "-", 8), 0.01);
    assertEquals("3.2 / 8 = .4", 0.4, Calculator.calculate(3.2, "/", 8), 0.01);
    assertEquals("3.2 * 8 = 25.6", 25.6, Calculator.calculate(3.2, "*", 8), 0.01);
    assertEquals("-3 + 0 = -3", -3, Calculator.calculate(-3, "+", 0), 0.01);
    assertEquals("-3 - 0 = -3", -3, Calculator.calculate(-3, "-", 0), 0.01);
    assertNull("-3 / 0 = null", Calculator.calculate(-3, "/", 0));
    assertEquals("-2 / -2 = 1", 1, Calculator.calculate(-2, "/", -2), 0.01);
    assertEquals("-3 * 0 = 0", 0, Calculator.calculate(-3, "*", 0), 0.01);
    assertNull("-3 w 0 = null", Calculator.calculate(-3, "w", 0));
  }
}
