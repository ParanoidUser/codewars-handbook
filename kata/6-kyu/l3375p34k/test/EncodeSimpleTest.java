import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EncodeSimpleTest {
  @Test
  void sample() {
    var encoder = new Leetspeak();
    assertEquals("", encoder.encode(""));
    assertEquals("", encoder.encode(null));
    assertEquals("4bcd3f", encoder.encode("abcdef"));
  }
}