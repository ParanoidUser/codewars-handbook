import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
  @Test
  void simpleLiteral() {
    assertEquals(127, Calculator.evaluate("127"), 1e-4);
  }

  @Test
  void subtractionAndAddition() {
    assertEquals(5, Calculator.evaluate("2 + 3"), 1e-4);
    assertEquals(-5, Calculator.evaluate("2 - 3 - 4"), 1e-4);
  }

  @Test
  void divisionAndMultiplication() {
    assertEquals(10, Calculator.evaluate("10 * 5 / 5"), 1e-4);
  }

  @Test
  void allMixed() {
    assertEquals(13, Calculator.evaluate("2 / 2 + 3 * 4"), 1e-4);
  }

  @Test
  void floats() {
    assertEquals(0, Calculator.evaluate("7.7 - 3.3 - 4.4"), 1e-4);
  }
}
