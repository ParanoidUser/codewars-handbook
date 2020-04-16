import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KeypadTest {
  @Test
  public void simpleTest() {
    assertEquals(9, Keypad.presses("LOL"));
    assertEquals(13, Keypad.presses("HOW R U"));
    assertEquals(47, Keypad.presses("WHERE DO U WANT 2 MEET L8R"));
  }
}
