import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ATMTest {
  @Test
  public void testATM() {
    assertEquals(4, ATM.solve(770));
    assertEquals(-1, ATM.solve(125));
    assertEquals(2, ATM.solve(550));
    assertEquals(1, ATM.solve(10));
    assertEquals(-1, ATM.solve(238));
  }
}
