import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DeltaBitsTest {
  @Test
  void sample() {
    assertEquals(2, DeltaBits.convertBits(31, 14));
  }
}
