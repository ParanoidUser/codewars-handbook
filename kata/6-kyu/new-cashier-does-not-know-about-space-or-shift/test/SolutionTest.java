import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke", Solution.getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));
    assertEquals("Burger Fries Fries Chicken Pizza Sandwich Milkshake Coke", Solution.getOrder("pizzachickenfriesburgercokemilkshakefriessandwich"));
  }
}