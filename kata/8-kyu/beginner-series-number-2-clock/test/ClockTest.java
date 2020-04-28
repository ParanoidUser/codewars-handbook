import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClockTest {
  @Test
  void sample() {
    assertEquals(61000, Clock.Past(0, 1, 1));
  }
}
