import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcTest {
  @Test
  void sample() {
    assertEquals(0, new Calc().evaluate(""), 0);
    assertEquals(3, new Calc().evaluate("3"), 0);
    assertEquals(3.5, new Calc().evaluate("3.5"), 0);
    assertEquals(4, new Calc().evaluate("1 3 +"), 0);
    assertEquals(3, new Calc().evaluate("1 3 *"), 0);
    assertEquals(-2, new Calc().evaluate("1 3 -"), 0);
    assertEquals(2, new Calc().evaluate("4 2 /"), 0);
  }
}
