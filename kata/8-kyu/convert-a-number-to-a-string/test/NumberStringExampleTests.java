import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberStringExampleTests {
  @Test
  void sample() {
    assertEquals("67", Kata.numberToString(67));
    assertEquals("123", Kata.numberToString(123));
    assertEquals("999", Kata.numberToString(999));
  }
}
