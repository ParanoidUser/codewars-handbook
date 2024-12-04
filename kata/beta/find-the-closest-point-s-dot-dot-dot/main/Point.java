record Point(double x, double y) {

  double distanceTo(Point other) {
    return Math.sqrt(Math.pow(x() - other.x(), 2) + Math.pow(y() - other.y(), 2));
  }
}