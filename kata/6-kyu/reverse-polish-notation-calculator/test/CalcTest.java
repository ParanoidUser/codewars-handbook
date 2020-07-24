import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcTest {
  @Test
  void sample() {
    assertEquals(0, Calc.evaluate(""), 0);
    assertEquals(3, Calc.evaluate("3"), 0);
    assertEquals(3.5, Calc.evaluate("3.5"), 0);
    assertEquals(4, Calc.evaluate("1 3 +"), 0);
    assertEquals(3, Calc.evaluate("1 3 *"), 0);
    assertEquals(-2, Calc.evaluate("1 3 -"), 0);
    assertEquals(2, Calc.evaluate("4 2 /"), 0);
  }
}
