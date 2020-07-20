import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KeypadTest {
  @Test
  void sample() {
    assertEquals(9, Keypad.presses("LOL"));
    assertEquals(13, Keypad.presses("HOW R U"));
    assertEquals(47, Keypad.presses("WHERE DO U WANT 2 MEET L8R"));
  }
}
