interface Kata {
  static long findWays(double m, double n) {
    double combinations = 1;
    double factorial = 1;
    for (int i = 0; i < n - 1; i++) {
      combinations *= m + n - i - 1;
      factorial *= i + 1;
    }
    return n > 0 ? (long) (combinations / factorial) : 0;
  }
}