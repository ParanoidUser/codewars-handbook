import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumDigNthTest {
  @Test
  void sample() {
    assertEquals(10, SumDigNth.sumDigNthTerm(10, new long[]{2, 1, 3}, 6));
    assertEquals(10, SumDigNth.sumDigNthTerm(10, new long[]{2, 1, 3}, 15));
    assertEquals(9, SumDigNth.sumDigNthTerm(10, new long[]{2, 1, 3}, 50));
    assertEquals(10, SumDigNth.sumDigNthTerm(10, new long[]{2, 1, 3}, 78));
    assertEquals(7, SumDigNth.sumDigNthTerm(10, new long[]{2, 1, 3}, 157));
  }
}
