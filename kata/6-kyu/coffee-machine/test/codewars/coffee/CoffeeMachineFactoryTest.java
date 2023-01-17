package codewars.coffee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import codewars.coffee.PreloadedCoffee.CoffeeMachineFactory;
import org.junit.jupiter.api.Test;

class CoffeeMachineFactoryTest {
  @Test
  void makeEspressoTest() {
    var coffee = CoffeeMachineFactory.buyCoffeeMachine().makeCoffee();
    assertEquals("espresso", coffee.getType());
  }
}