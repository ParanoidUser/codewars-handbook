interface Kata {
  static int sumTriangularNumbers(int n) {
    return Math.max(0, n * (n + 1) * (n + 2) / 6);
  }
}
