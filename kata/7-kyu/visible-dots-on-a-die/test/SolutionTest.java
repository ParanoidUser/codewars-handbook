import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(17, new DiceDotCount().totalAmountVisible(3, 6));
    assertEquals(30, new DiceDotCount().totalAmountVisible(3, 8));
    assertEquals(66, new DiceDotCount().totalAmountVisible(1, 12));
  }
}
