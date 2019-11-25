import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DescendingOrderTest {
  @Test
  public void test_01() {
    assertEquals(0, DescendingOrder.sortDesc(0));
  }

  @Test
  public void test_02() {
    assertEquals(51, DescendingOrder.sortDesc(15));
  }

  @Test
  public void test_03() {
    assertEquals(987654321, DescendingOrder.sortDesc(123456789));
  }
}
