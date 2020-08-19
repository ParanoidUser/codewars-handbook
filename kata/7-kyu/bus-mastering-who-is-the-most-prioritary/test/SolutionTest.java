import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("001000000", BusMastering.arbitrate("001000101", 9));
    assertEquals("000000100", BusMastering.arbitrate("000000101", 9));
    assertEquals("0000", BusMastering.arbitrate("0000", 4));
  }
}
