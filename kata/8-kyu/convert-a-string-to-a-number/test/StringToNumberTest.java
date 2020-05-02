import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringToNumberTest {
  @Test
  void sample() {
    assertEquals(1234, StringToNumber.stringToNumber("1234"));
    assertEquals(605, StringToNumber.stringToNumber("605"));
    assertEquals(1405, StringToNumber.stringToNumber("1405"));
    assertEquals(-7, StringToNumber.stringToNumber("-7"));
  }
}