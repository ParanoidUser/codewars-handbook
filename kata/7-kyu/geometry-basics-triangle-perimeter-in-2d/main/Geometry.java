interface Geometry {
  class Triangle {
    final Point a;
    final Point b;
    final Point c;

    Triangle(Point a, Point b, Point c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }
  }

  class Point {
    final double x;
    final double y;

    Point(double x, double y) {
      this.x = x;
      this.y = y;
    }
  }
}
