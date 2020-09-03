interface GCD {
  static int compute(int x, int y) {
    return x % y > 0 ? compute(y, x % y) : y;
  }
}
