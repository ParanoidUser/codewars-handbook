package codewars.coffee;

import static codewars.coffee.TestCoffeeMachine.counter;
import static codewars.coffee.TestCoffeeMachine.data;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeKataTest {
  private TestCoffeeMachine machine;

  @BeforeEach
  void setUp() {
    machine = new TestCoffeeMachine();
  }

  @Test
  void makeEspresso() {
    var kata = new CoffeeKata();
    var coffee = kata.getMachine().makeCoffee();
    assertEquals("espresso", coffee.getType());
  }

  @Test
  void makeCoffee() {
    CoffeeKata kata = new CoffeeKata(machine);
    for (int i = 0; i < 10; i++) {
      kata.getMachine().makeCoffee();
    }
    assertCoffeeResults(kata);
  }

  private void assertCoffeeResults(CoffeeKata kata) {
    assertEquals(counter.get(), kata.numberOfCoffeeMade());
    for (Map.Entry<String, Integer> entry : data.entrySet()) {
      assertEquals(entry.getValue(), kata.numberOfCoffeeTypesMade().get(entry.getKey()));
    }
  }
}