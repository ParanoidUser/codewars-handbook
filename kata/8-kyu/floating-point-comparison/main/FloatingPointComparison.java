interface FloatingPointComparison {
  static boolean approxEquals(double a, double b) {
    return Math.abs(a - b) < .001;
  }
}