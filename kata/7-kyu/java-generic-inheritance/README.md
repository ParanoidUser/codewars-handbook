# [Java: Generic Inheritance](https://www.codewars.com/kata/java-generic-inheritance "https://www.codewars.com/kata/6705c60be3abf45ead76d052")

I am creating a class hierarchy of geometrical `Shape`s. This is my base class:
```java
abstract class Shape {
  public abstract double getArea();
}
```

And this is a circle:

```java
class Circle extends Shape {
  public final double radius;
  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }
}
```

There are other shapes, like `Rectangle`s, `Square`s, etc.

___

I also wrote a utility class `ShapeUtilities`. One of those utilities is a function that computes the total area of a list of shapes:
```java
public static double sumAllAreas(List<Shape> shapes) {
  double totalArea = 0.0;
  for (Shape shape : shapes)
    totalArea += shape.getArea();
  return totalArea;
}
```

This seems to work fine:
```java
List<Shape> shapes = List.of(new Circle(2), new Rectangle(3, 3), new Square(2));
double totalArea = ShapeUtilities.sumAllAreas(shapes); // 25.567
```

But when I try to call it with a `List<Circle>`, the code does not compile, even though `Circle` inherits from `Shape` :(

```java
List<Circle> circles = List.of(new Circle(2), new Circle(1), new Circle(5));
double totalArea = ShapeUtilities.sumAllAreas(circles); // compilation error !
```

___

Can you fix the code so that `sumAllAreas()` works with `Shape` and all its subtypes?