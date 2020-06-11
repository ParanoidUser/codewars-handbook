interface BankerPlan {
  static boolean fortune(int f0, double p, int c0, int n, double i) {
    while (--n > 0) {
      f0 += f0 * p / 100 - c0;
      c0 += c0 * i / 100;
    }
    return f0 > -1;
  }
}
