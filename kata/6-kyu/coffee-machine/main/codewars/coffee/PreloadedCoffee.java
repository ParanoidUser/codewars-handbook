package codewars.coffee;

import lombok.AllArgsConstructor;
import lombok.Getter;

interface PreloadedCoffee {
  interface CoffeeMachineFactory {
    static CoffeeMachine buyCoffeeMachine() {
      return () -> new Coffee("espresso");
    }
  }

  interface CoffeeMachine {
    Coffee makeCoffee();
  }

  @AllArgsConstructor
  @Getter
  class Coffee {
    private final String type;
  }
}
