import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringCalculatorFunctionalTest {
  @Test
  void sample() {
    assertEquals("314", StringCalculatorFunctional.sum("314"));
    assertEquals("10", StringCalculatorFunctional.sum("6, 4"));
    assertEquals("13", StringCalculatorFunctional.sum("2, 11, bad string"));
    assertEquals("40", StringCalculatorFunctional.sum("1, bad input, 20, 10, bad input, bad input, 9"));
    assertEquals("Calculation failed", StringCalculatorFunctional.sum(""));
    assertEquals("Calculation failed", StringCalculatorFunctional.sum("bad string"));
  }
}