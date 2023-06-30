import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class GapInPrimesTest {
  @Test
  void sample() {
    assertArrayEquals(new long[]{101, 103}, GapInPrimes.gap(2, 100, 110));
    assertArrayEquals(new long[]{103, 107}, GapInPrimes.gap(4, 100, 110));
    assertArrayEquals(new long[]{359, 367}, GapInPrimes.gap(8, 300, 400));
    assertArrayEquals(new long[]{337, 347}, GapInPrimes.gap(10, 300, 400));
    assertNull(GapInPrimes.gap(6, 100, 110));
  }
}