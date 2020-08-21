interface HarmonicPoints {
  static double harmPoints(double a, double b, double c) {
    return ((c = (a - c) / (b - c)) * b + a) / (c + 1);
  }
}
