class Rectangle extends Shape {
  private final double area;

  Rectangle(double height, double width) {
    this.area = height * width;
  }

  @Override
  public double getArea() {
    return area;
  }
}