import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HowManyPizzasTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1/1 1/1 1/1 1/1 1/1, 5
      1/2 1/2 1/2 1/2, 2
      10/12 8/6 20/8, 5
      1/6 2/8 12/4, 4
      3/5 4/5 6/5, 3
      1/4 3/4 1/2, 2
      0/1 0/2 0/3, 0
      '', 0
      , 0
      """)
  void sample(String order, int pizzas) {
    String[] pizzaSlices = order != null ? order.split(" ") : null;
    assertEquals(pizzas, HowManyPizzas.numberOfPizzasToOrder(pizzaSlices));
  }
}