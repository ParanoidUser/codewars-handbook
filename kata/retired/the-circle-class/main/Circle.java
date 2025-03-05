record Circle(double radius, Point origin) {
  Point pointFromAngle(int degrees) {
    return pointFromAngle(Math.toRadians(degrees));
  }

  Point pointFromAngle(double radians) {
    return new Point(origin.x + radius * Math.cos(radians), origin.y + radius * Math.sin(radians));
  }
}