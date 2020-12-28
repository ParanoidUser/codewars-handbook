import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SameNbDivisorsTest {
  @Test
  void sample() {
    assertEquals(8, SameNbDivisors.countPairsInt(1, 50));
    assertEquals(7, SameNbDivisors.countPairsInt(3, 100));
    assertEquals(18, SameNbDivisors.countPairsInt(3, 200));
    assertEquals(86, SameNbDivisors.countPairsInt(6, 350));
    assertEquals(214, SameNbDivisors.countPairsInt(6, 1000));
    assertEquals(189, SameNbDivisors.countPairsInt(7, 1500));
    assertEquals(309, SameNbDivisors.countPairsInt(7, 2500));
    assertEquals(366, SameNbDivisors.countPairsInt(7, 3000));
    assertEquals(487, SameNbDivisors.countPairsInt(9, 4000));
    assertEquals(622, SameNbDivisors.countPairsInt(9, 5000));
    assertEquals(567, SameNbDivisors.countPairsInt(11, 5000));
    assertEquals(2712, SameNbDivisors.countPairsInt(2, 18856));
  }
}