import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PizzaTest {
  @Test
  void sample() {
    assertEquals(-1, Pizza.maxPizza(-2));
    assertEquals(1, Pizza.maxPizza(0));
    assertEquals(7, Pizza.maxPizza(3));
  }
}
