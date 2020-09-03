import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DescendingOrderTest {
  @Test
  void sample() {
    assertEquals(0, DescendingOrder.sortDesc(0));
    assertEquals(51, DescendingOrder.sortDesc(15));
    assertEquals(987654321, DescendingOrder.sortDesc(123456789));
  }
}
