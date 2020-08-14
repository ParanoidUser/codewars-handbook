import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ATMTest {
  @Test
  void sample() {
    assertEquals(4, ATM.solve(770));
    assertEquals(-1, ATM.solve(125));
    assertEquals(2, ATM.solve(550));
    assertEquals(1, ATM.solve(10));
    assertEquals(-1, ATM.solve(238));
  }
}
