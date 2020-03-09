import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PizzaTest {
  @Test
  public void testNegative() {
    assertEquals(-1, Pizza.maxPizza(-2));
  }

  @Test
  public void testZero() {
    assertEquals(1, Pizza.maxPizza(0));
  }

  @Test
  public void test3() {
    assertEquals(7, Pizza.maxPizza(3));
  }
}
