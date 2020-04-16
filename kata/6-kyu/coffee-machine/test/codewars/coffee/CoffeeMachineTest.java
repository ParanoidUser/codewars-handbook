package codewars.coffee;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoffeeMachineTest {
  private TestCoffeeMachine machine;

  @Before
  public void setUp() {
    machine = new TestCoffeeMachine();
  }

  @Test
  public void makeCoffee() {
    CoffeeKata kata = new CoffeeKata(machine);
    for (int i = 0; i < 10; i++) {
      kata.getMachine().makeCoffee();
    }
    assertCoffeeResults(kata);
  }

  private void assertCoffeeResults(CoffeeKata kata) {
    Assert.assertEquals(TestCoffeeMachine.counter.get(), kata.numberOfCoffeeMade());
    for (Map.Entry<String, Integer> entry : TestCoffeeMachine.data.entrySet()) {
      Assert.assertEquals(entry.getValue(), kata.numberOfCoffeeTypesMade().get(entry.getKey()));
    }
  }
}
