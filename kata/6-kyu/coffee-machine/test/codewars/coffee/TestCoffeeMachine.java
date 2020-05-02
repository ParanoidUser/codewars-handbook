package codewars.coffee;

import codewars.coffee.PreloadedCoffee.Coffee;
import codewars.coffee.PreloadedCoffee.CoffeeMachine;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class TestCoffeeMachine implements CoffeeMachine {
  private static final String[] coffeeTypes = {
      "Espresso", "Percolated", "Turkish coffee", "Caffe Americano", "Cafe Cubano"
  };
  private static final Random random = new Random();

  static Coffee generate() {
    return new Coffee(coffeeTypes[random.nextInt(coffeeTypes.length)]);
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
