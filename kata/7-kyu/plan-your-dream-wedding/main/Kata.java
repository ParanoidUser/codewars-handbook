interface Kata {
  static double maxWeddingCost(int C, double r, int S, int T, int W) {
    return 1 / (r /= 100) * Math.min(
        C * Math.pow(r + 1, 12 * W) - C,
       (C * Math.pow(r + 1, 12 * T) - C - S * r) * Math.pow(r + 1, 12 * (W - T))
    );
  }
}