import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(21, Sum.arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    assertEquals(-21, Sum.arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
    assertEquals(15, Sum.arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
    assertEquals(2100, Sum.arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
  }
}
