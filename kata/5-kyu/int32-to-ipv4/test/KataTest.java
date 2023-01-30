import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals("128.114.17.104", Kata.longToIP(2154959208L));
    assertEquals("0.0.0.0", Kata.longToIP(0));
    assertEquals("128.32.10.1", Kata.longToIP(2149583361L));
  }
}