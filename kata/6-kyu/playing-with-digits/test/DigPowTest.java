import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DigPowTest {
  @Test
  void sample() {
    assertEquals(1, DigPow.digPow(89, 1));
    assertEquals(-1, DigPow.digPow(92, 1));
    assertEquals(51, DigPow.digPow(46288, 3));
  }
}
