interface Steps {
  static int step(double x, double y) {
    return (int) Math.sqrt(4 * (y - x) - (y > x ? 1 : 0));
  }
}