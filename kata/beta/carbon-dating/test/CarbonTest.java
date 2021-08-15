import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarbonTest {
  @Test
  void sample() {
    assertEquals(5.70, Carbon.dating(20, 10320), 0.00);
    assertEquals(0.16, Carbon.dating(75, 50761), 0.00);
    assertEquals(1.67, Carbon.dating(45, 27107), 0.00);
  }
}