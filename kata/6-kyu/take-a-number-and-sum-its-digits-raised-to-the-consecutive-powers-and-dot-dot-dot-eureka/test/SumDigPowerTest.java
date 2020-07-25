import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SumDigPowerTest {
  @Test
  void sample() {
    assertEquals(List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L), SumDigPower.sumDigPow(1, 10));
    assertEquals(List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 89L), SumDigPower.sumDigPow(1, 100));
    assertEquals(List.of(89L), SumDigPower.sumDigPow(10, 100));
    assertEquals(List.of(135L), SumDigPower.sumDigPow(90, 150));
    assertEquals(List.of(89L, 135L), SumDigPower.sumDigPow(50, 150));
    assertEquals(List.of(89L, 135L), SumDigPower.sumDigPow(10, 150));
    assertEquals(List.of(), SumDigPower.sumDigPow(90, 100));
  }
}
