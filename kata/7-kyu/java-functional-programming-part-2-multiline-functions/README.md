# [Java Functional Programming (Part 2: Multiline Functions)](https://www.codewars.com/kata/java-functional-programming-part-2-multiline-functions "https://www.codewars.com/kata/54a6c6e7478d8ee02d000cd9")

With the release of Java 8, Java has finally added support for "lambda functions", that is, variables that contain a function which can operate on data just as class methods can (well, not _just_ as class methods can...)

Let's learn about lambdas.

Last time, we did something similar to this:

```
Function<MyObject, String> f = p -> p.toString();
String myString = f.apply(myObject); //Stores whatever the toString() of myObject is in myString
```

But what if we need more than one line in our function for the calculations? The syntax to do so is to enclose the function's commands in curly brackets and include a return statement:

```
Function<MyObject, String> f = p -> {StringBuffer out = new StringBuffer();
                                     out.append(p.getName());
                                     out.append(MyObject.getStaticName());
                                     out.append("Constant message");
                                     return out.toString();
                               };
```

Given this POJO:

```
public class Triangle {
  public final int height;
  public final int base;
  private double area;
  public void setArea(double a) {
    area = a;
  }
  public double getArea() {
    return area;
  }
}
```

Write a function that sets the area of the given Triangle and returns the area as a `double`. Do not use the function type Function; there is a function type for converting an arbitrary class into a `double`, use that.

The formula for triangle area is: 1/2 \* base \* height

Assume valid input (base and height are both greater than 0).

A full listing of the default function types can be found at https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html