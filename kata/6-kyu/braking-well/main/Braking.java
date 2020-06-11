interface Braking {
  static double dist(double v, double mu) {
    return (v /= 3.6) + Math.pow(v, 2) / mu / 19.62;
  }

  static double speed(double d, double mu) {
    return 1.8 * (Math.sqrt(4 * (mu = .05097 / mu) * d + 1) - 1) / mu;
  }
}
