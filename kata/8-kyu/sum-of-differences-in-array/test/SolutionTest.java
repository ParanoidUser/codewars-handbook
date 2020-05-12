import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(9, ZywOo.sumOfDifferences(new int[]{1, 2, 10}));
    assertEquals(2, ZywOo.sumOfDifferences(new int[]{-3, -2, -1}));
    assertEquals(0, ZywOo.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
    assertEquals(34, ZywOo.sumOfDifferences(new int[]{-17, 17}));
    assertEquals(0, ZywOo.sumOfDifferences(new int[0]));
    assertEquals(0, ZywOo.sumOfDifferences(new int[]{0}));
    assertEquals(0, ZywOo.sumOfDifferences(new int[]{-1}));
    assertEquals(0, ZywOo.sumOfDifferences(new int[]{1}));
  }
}
