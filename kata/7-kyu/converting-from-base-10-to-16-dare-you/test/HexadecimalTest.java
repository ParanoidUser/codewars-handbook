import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HexadecimalTest {
  @Test
  void sample() {
    assertEquals("0x100", Hexadecimal.convertToHex(256));
  }
}
