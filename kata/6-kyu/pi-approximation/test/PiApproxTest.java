import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PiApproxTest {
  @Test
  void sample() {
    assertEquals("[10, 3.0418396189]", PiApprox.iterPi2String(0.1));
  }
}
