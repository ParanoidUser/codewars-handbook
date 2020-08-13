import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("100+20+6", DecimalDecomposition.decimalDecomposition(126));
    assertEquals("700000+10000+2000+600+50+4", DecimalDecomposition.decimalDecomposition(712654));
  }
}
