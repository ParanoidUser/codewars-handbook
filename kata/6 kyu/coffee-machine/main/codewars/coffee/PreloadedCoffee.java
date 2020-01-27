package codewars.coffee;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class PreloadedCoffee {
  public static class CoffeeMachineFactory {
    public static CoffeeMachine buyCoffeeMachine() {
      return () -> new Coffee("espresso");
    }
  }

  public interface CoffeeMachine {
    Coffee makeCoffee();
  }

  @AllArgsConstructor
  @Getter
  public static class Coffee {
    private final String type;
  }
}
