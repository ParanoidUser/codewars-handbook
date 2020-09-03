import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("0", Kata.broken("1"));
    assertEquals("01111111010010000001100110111", Kata.broken("10000000101101111110011001000"));
    assertEquals("011101", Kata.broken("100010"));
  }
}
