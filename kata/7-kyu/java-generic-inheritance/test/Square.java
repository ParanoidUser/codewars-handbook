class Square extends Shape {
  private final double area;

  Square(double side) {
    this.area = side * side;
  }

  @Override
  public double getArea() {
    return area;
  }
}