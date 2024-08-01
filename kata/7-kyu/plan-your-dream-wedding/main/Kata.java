interface Kata {
  static double maxWeddingCost(int c, double r, int s, double t, double w) {
    return 1 / (r /= 100) * Math.min(
        c * Math.pow(r + 1, 12 * w) - c,
       (c * Math.pow(r + 1, 12 * t) - c - s * r) * Math.pow(r + 1, 12 * (w - t))
    );
  }
}