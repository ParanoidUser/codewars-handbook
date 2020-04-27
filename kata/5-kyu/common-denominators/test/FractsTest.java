import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FractsTest {
  @Test
  void sample() {
    assertEquals("(6,12)(4,12)(3,12)", Fracts.convertFrac(new long[][]{{1, 2}, {1, 3}, {10, 40}}));
    assertEquals("", Fracts.convertFrac(new long[0][]));
  }
}
