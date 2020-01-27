package codewars.coffee;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class TestCoffeeMachine implements PreloadedCoffee.CoffeeMachine {
  private static final String[] coffeTypes = {
    "Espresso", "Percolated", "Turkish coffee", "Caffe Americano", "Cafe Cubano"
  };
  private static final Random random = new Random();

  public static PreloadedCoffee.Coffee generate() {
    return new PreloadedCoffee.Coffee(coffeTypes[random.nextInt(coffeTypes.length)]);
  }

  public static final Map<String, Integer> data    = new HashMap<>();
  public static     AtomicInteger        counter = new AtomicInteger(0);


  @Override
  public codewars.coffee.PreloadedCoffee.Coffee makeCoffee() {
    counter.incrementAndGet();
    codewars.coffee.PreloadedCoffee.Coffee coffee = generate();
    data.compute(coffee.getType(), (a, b) -> b != null ? b + 1 : 1);
    return coffee;
  }
}
