interface ApproxFloat {
  static double f(double x) {
    return Math.expm1(Math.log1p(x) / 2);
  }
}
