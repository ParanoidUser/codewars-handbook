interface HarmonicPoints {
  static double harmPoints(double a, double b, double c) {
    double h = (a - c) / (b - c);
    return (h * b + a) / (h + 1);
  }
}
