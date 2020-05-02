package codewars.coffee;

import static codewars.coffee.PreloadedCoffee.CoffeeMachine;
import static codewars.coffee.PreloadedCoffee.CoffeeMachineFactory.buyCoffeeMachine;

import java.util.HashMap;
import java.util.Map;

class CoffeeKata {
  private final Map<String, Integer> stats = new HashMap<>();
  private final CoffeeMachine machine;

  CoffeeKata() {
    this(buyCoffeeMachine());
  }

  CoffeeKata(CoffeeMachine machine) {
    this.machine = machine;
  }

  CoffeeMachine getMachine() {
    return () -> {
      var coffee = machine.makeCoffee();
      stats.put(coffee.getType(), stats.computeIfAbsent(coffee.getType(), t -> 0) + 1);
      return coffee;
    };
  }

  int numberOfCoffeeMade() {
    return stats.values().stream().mapToInt(i -> i).sum();
  }

  Map<String, Integer> numberOfCoffeeTypesMade() {
    return stats;
  }
}
