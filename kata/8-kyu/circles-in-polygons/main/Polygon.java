class Polygon {
  private final double diameter;

  Polygon(int sides, int sideLength) {
    this.diameter = sideLength / Math.tan(Math.toRadians(180d / sides));
  }

  double circleDiameter() {
    return this.diameter;
  }
}
