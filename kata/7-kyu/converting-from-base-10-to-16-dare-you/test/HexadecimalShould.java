import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HexadecimalShould {
  @Test
  void sample() {
    assertEquals("0x100", Hexadecimal.convertToHex(256));
  }
}
