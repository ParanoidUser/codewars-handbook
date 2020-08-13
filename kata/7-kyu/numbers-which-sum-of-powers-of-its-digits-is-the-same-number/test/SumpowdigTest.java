import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SumpowdigTest {
  @Test
  void sample() {
    assertArrayEquals(new long[0], Sumpowdig.eqSumPowDig(100, 2));
    assertArrayEquals(new long[]{153}, Sumpowdig.eqSumPowDig(200, 3));
    assertArrayEquals(new long[]{153, 370}, Sumpowdig.eqSumPowDig(370, 3));
    assertArrayEquals(new long[]{153, 370, 371}, Sumpowdig.eqSumPowDig(400, 3));
    assertArrayEquals(new long[]{153, 370, 371, 407}, Sumpowdig.eqSumPowDig(500, 3));
  }
}
