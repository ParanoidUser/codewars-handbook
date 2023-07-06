import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  void sample() {
    assertEquals("0000000000", Door.run(".........."), "should stay closed unless button is pressed (no buttonpresses)");
    assertEquals("123", Door.run("P.."), "should start opening on buttonpress");
    assertEquals("12345", Door.run("P...."), "should open completely and stay open");
    assertEquals("12222", Door.run("P.P.."), "should start opening and pause on second buttonpress");
    assertEquals("1210000", Door.run("P.O...."), "should reverse while opening");
    assertEquals("001234321000", Door.run("..P...O....."), "should start opening and reverse when obstacle");
  }
}