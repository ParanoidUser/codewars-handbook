interface Circle {
  static double area(double radius) {
    if (radius > 0) return Math.PI * radius * radius;
    throw new IllegalArgumentException();
  }
}
