import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumTest {
  @Test
  void sample() {
    assertEquals(-1, new Sum().GetSum(0, -1));
    assertEquals(1, new Sum().GetSum(0, 1));
  }
}
