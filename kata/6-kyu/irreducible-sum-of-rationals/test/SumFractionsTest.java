import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SumFractionsTest {
  @Test
  void sample() {
    int[][] a = {{1, 2}, {2, 9}, {3, 18}, {4, 24}, {6, 48}};
    assertEquals("[85, 72]", SumFractions.sumFracts(a));

    int[][] b = {{1, 2}, {1, 3}, {1, 4}};
    assertEquals("[13, 12]", SumFractions.sumFracts(b));

    int[][] c = {{1, 3}, {5, 3}};
    assertEquals("2", SumFractions.sumFracts(c));

    int[][] d = {{-1, 3}, {-5, 3}};
    assertNull(SumFractions.sumFracts(d));
  }
}
