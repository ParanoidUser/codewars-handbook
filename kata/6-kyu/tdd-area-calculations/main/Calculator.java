import static java.math.BigDecimal.valueOf;
import static java.math.RoundingMode.HALF_UP;
import static java.util.stream.Stream.of;

class Calculator {
  double getTotalArea(Shape... shapes) {
    return valueOf(of(shapes).mapToDouble(s -> s.area).sum()).setScale(2, HALF_UP).doubleValue();
  }
}

class Shape {
  final double area;
  Shape(double area) {
    this.area = area;
  }
}

class Circle extends Shape {
  Circle(double radius) {
    super(Math.PI * radius * radius);
  }
}

class Rectangle extends Shape {
  Rectangle(double height, double width) {
    super(height * width);
  }
}

class Square extends Shape {
  Square(double side) {
    super(side * side);
  }
}

class Triangle extends Shape {
  Triangle(double triangleBase, double triangleHeight) {
    super(triangleBase * triangleHeight / 2);
  }
}