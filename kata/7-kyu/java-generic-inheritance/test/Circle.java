class Circle extends Shape {
  private final double area;

  Circle(double radius) {
    this.area = Math.PI * radius * radius;
  }

  @Override
  public double getArea() {
    return area;
  }
}