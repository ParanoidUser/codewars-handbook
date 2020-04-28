interface Geometry {
  static double squareArea(double a) {
    return Math.round(Math.pow(.636619 * a, 2) * 100) / 100.;
  }
}
