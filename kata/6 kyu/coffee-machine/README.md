# [Coffee machine](https://www.codewars.com/kata/coffee-machine "https://www.codewars.com/kata/5980de1a17d1fee3db000059")

Your company decided to buy a `CoffeeMachine` from a `CoffeeMachineFactory`. 

After some time your boss start to suspect that employees are not drinking the coffee from the machine. So you are asked to find a way and improve the machine to track how much coffees were taken from the machine. And also as your boss likes statistics he would also like to now how much of each kind of coffee the machine produced.

So here you are - one on one with `CoffeeMachine`:
```
public interface CoffeeMachine {
    Coffee makeCoffee();
}
```
which produces coffees:
```
public class Coffee {
    //...
    public final String getType() {
        return type;
    }
}
```
bought from `CoffeMachineFactory`:
```
public class CoffeeMachineFactory {
    public static CoffeeMachine buyCoffeeMachine() {
        ....
    }
}
```

Can you figure it out?