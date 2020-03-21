interface Shape extends Comparable<Shape> {
  double getArea();

  @Override
  default int compareTo(Shape other) {
    return Double.compare(getArea(), other.getArea());
  }
}

class CustomShape implements Shape {
  final double area;

  CustomShape(double area) {
    this.area = area;
  }

  @Override
  public double getArea() {
    return area;
  }
}

class Rectangle extends CustomShape {
  Rectangle(double width, double height) {
    super(width * height);
  }
}

class Circle extends Rectangle {
  Circle(double radius) {
    super(Math.PI, radius * radius);
  }
}

class Square extends Rectangle {
  Square(double side) {
    super(side, side);
  }
}

class Triangle extends Rectangle {
  Triangle(double base, double height) {
    super(base, height / 2);
  }
}
