interface Kata {
  static double getChance(int n, int x, int a) {
    double p = 1;
    while (a-- > 0) {
      p = p * (n - x) / n--;
    }
    return Math.round(100 * p) / 100.;
  }
}
