import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MoneyTest {
  @Test
  void sample() {
    assertEquals(3, Money.calculateYears(1000, 0.05, 0.18, 1100));
    assertEquals(14, Money.calculateYears(1000, 0.01625, 0.18, 1200));
    assertEquals(0, Money.calculateYears(1000, 0.05, 0.18, 1000));
  }
}
