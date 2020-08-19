import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinaryCalculatorTest {
  @Test
  void sample() {
    assertEquals("10", BinaryCalculator.calculate("1", "1", "add"));
    assertEquals("0", BinaryCalculator.calculate("1", "1", "subtract"));
    assertEquals("1", BinaryCalculator.calculate("1", "1", "multiply"));
    assertEquals("0", BinaryCalculator.calculate("1", "0", "multiply"));
  }
}
