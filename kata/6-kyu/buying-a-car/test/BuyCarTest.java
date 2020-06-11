import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class BuyCarTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{6, 766}, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
    assertArrayEquals(new int[]{0, 4000}, BuyCar.nbMonths(12000, 8000, 1000, 1.5));
  }
}
