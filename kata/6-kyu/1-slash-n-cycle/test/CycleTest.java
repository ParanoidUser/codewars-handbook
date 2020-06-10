import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CycleTest {
  @Test
  void sample() {
    assertEquals(2, Cycle.cycle(33));
    assertEquals(-1, Cycle.cycle(18118));
    assertEquals(22, Cycle.cycle(69));
    assertEquals(98, Cycle.cycle(197));
    assertEquals(-1, Cycle.cycle(65));
  }
}
