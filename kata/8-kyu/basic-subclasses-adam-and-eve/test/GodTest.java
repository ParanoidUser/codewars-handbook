import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GodTest {
  @Test
  void sample() {
    assertTrue(God.create()[0] instanceof Man);
  }
}
