# [Very Simple Inheritance for Beginners](https://www.codewars.com/kata/very-simple-inheritance-for-beginners "https://www.codewars.com/kata/585d7447f2d8dd59ad000197")

There exists a preloaded abstract class named Operation:

```
abstract class Operation
{
  double result;
  abstract void execute(double variable1, double variable2);
}
```

Your job is to create 4 new classes which inherit the 'Operation' class. Within the class, create the proper **execute** method and save the mathematical operation to the proper **result** variable. The class names must be as follows:

* Add
* Subtract
* Multiply
* Divide