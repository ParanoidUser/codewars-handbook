import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
  @Test
  public void simpleLiteral() {
    assertEquals("simple literal", 127, Calculator.evaluate("127"), 1e-4);
  }

  @Test
  public void subtractionAndAddition() {
    assertEquals("addition", 5, Calculator.evaluate("2 + 3"), 1e-4);
    assertEquals("subtraction", -5, Calculator.evaluate("2 - 3 - 4"), 1e-4);
  }

  @Test
  public void divisionAndMultiplication() {
    assertEquals("mixed division and multiplication", 10, Calculator.evaluate("10 * 5 / 5"), 1e-4);
  }

  @Test
  public void allMixed() {
    assertEquals("mixed", 13, Calculator.evaluate("2 / 2 + 3 * 4"), 1e-4);
  }

  @Test
  public void floats() {
    assertEquals("floats 1", 0, Calculator.evaluate("7.7 - 3.3 - 4.4"), 1e-4);
  }
}
