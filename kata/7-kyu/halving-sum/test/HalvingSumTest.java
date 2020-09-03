import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HalvingSumTest {
  @Test
  void sample() {
    assertEquals(47, new HalvingSum().halvingSum(25));
    assertEquals(247, new HalvingSum().halvingSum(127));
  }
}
