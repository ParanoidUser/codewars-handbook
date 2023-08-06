import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PerfectPowerTest {
  @Test
  void sample() {
    assertNull(PerfectPower.isPerfectPower(0));
    assertNull(PerfectPower.isPerfectPower(1));
    assertNull(PerfectPower.isPerfectPower(2));
    assertNull(PerfectPower.isPerfectPower(3));
    assertArrayEquals(new int[]{2, 2}, PerfectPower.isPerfectPower(4));
    assertNull(PerfectPower.isPerfectPower(5));
    assertArrayEquals(new int[]{2, 3}, PerfectPower.isPerfectPower(8));
    assertArrayEquals(new int[]{3, 2}, PerfectPower.isPerfectPower(9));
  }
}