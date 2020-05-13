import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class TipCalculatorTest {
  @Test
  void sample() {
    assertEquals(2, TipCalculator.calculateTip(30d, "poor"));
    assertEquals(4, TipCalculator.calculateTip(20d, "Excellent"));
    assertEquals(17, TipCalculator.calculateTip(107.65, "GReat"));
    assertNull(TipCalculator.calculateTip(20d, "hi"));
  }
}