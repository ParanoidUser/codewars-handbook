interface Kata {
  static double areaOfPolygonInsideCircle(double r, int n) {
    return Math.round(.5e3 * n * Math.pow(r, 2) * Math.sin(6.2831853 / n)) / 1.0e3;
  }
}
