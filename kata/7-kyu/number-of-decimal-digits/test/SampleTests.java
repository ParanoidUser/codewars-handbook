import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertEquals(1, DecTools.Digits(5L));
    assertEquals(5, DecTools.Digits(12345L));
    assertEquals(10, DecTools.Digits(9876543210L));
  }
}
