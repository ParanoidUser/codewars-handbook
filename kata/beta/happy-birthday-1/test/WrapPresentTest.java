import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WrapPresentTest {
  @Test
  void sample() {
    assertEquals(162, WrapPresent.wrap(17, 32, 11));
    assertEquals(124, WrapPresent.wrap(13, 13, 13));
    assertEquals(32, WrapPresent.wrap(1, 3, 1));
  }
}
