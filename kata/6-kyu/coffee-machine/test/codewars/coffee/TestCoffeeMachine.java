package codewars.coffee;

import static java.util.concurrent.ThreadLocalRandom.current;

import codewars.coffee.PreloadedCoffee.Coffee;
import codewars.coffee.PreloadedCoffee.CoffeeMachine;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class TestCoffeeMachine implements CoffeeMachine {
  private static final String[] coffeeTypes = {
      "Espresso", "Percolated", "Turkish coffee", "Caffe Americano", "Cafe Cubano"
  };

  static Coffee generate() {
    return new Coffee(coffeeTypes[current().nextInt(coffeeTypes.length)]);
  }

  static final Map<String, Integer> data = new HashMap<>();
  static AtomicInteger counter = new AtomicInteger(0);


  @Override
  public Coffee makeCoffee() {
    counter.incrementAndGet();
    Coffee coffee = generate();
    data.compute(coffee.getType(), (a, b) -> b != null ? b + 1 : 1);
    return coffee;
  }
}
