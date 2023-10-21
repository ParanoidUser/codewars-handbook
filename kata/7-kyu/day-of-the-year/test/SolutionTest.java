import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(145, DateToInt.toDayOfYear(new int[]{25, 5, 2022}));
    assertEquals(137, DateToInt.toDayOfYear(new int[]{17, 5, 1991}));
    assertEquals(295, DateToInt.toDayOfYear(new int[]{22, 10, 1990}));
    assertEquals(1, DateToInt.toDayOfYear(new int[]{1, 1, 2001}));
    assertEquals(1, DateToInt.toDayOfYear(new int[]{1, 1, 2000}));
    assertEquals(365, DateToInt.toDayOfYear(new int[]{31, 12, 2003}));
    assertEquals(366, DateToInt.toDayOfYear(new int[]{31, 12, 2004}));
    assertEquals(60, DateToInt.toDayOfYear(new int[]{29, 2, 2008}));
  }
}