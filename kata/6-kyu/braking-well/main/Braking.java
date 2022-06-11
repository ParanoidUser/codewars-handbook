interface Braking {
  static double dist(double v, double mu) {
    v /= 3.6;
    return v + Math.pow(v, 2) / mu / 19.62;
  }

  static double speed(double d, double mu) {
    mu = .05097 / mu;
    return 1.8 * (Math.sqrt(4 * mu * d + 1) - 1) / mu;
  }
}
