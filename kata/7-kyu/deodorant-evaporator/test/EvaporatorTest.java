import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EvaporatorTest {
  @Test
  void sample() {
    assertEquals(22, Evaporator.evaporator(10, 10, 10));
  }
}
