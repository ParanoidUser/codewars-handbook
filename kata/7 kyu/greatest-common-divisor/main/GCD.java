class GCD {
  static int compute(int x, int y) {
    return x % y == 0 ? y : compute(y, x % y);
  }
}
