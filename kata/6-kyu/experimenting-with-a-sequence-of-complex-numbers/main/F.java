interface F {
  static int f(double x, double y, double eps) {
    return (int) Math.max(-1, Math.log(eps) / Math.log(Math.hypot(x, y)));
  }
}
