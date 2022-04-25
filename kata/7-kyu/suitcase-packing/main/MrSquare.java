interface MrSquare {
  static boolean fitIn(int a, int b, int m, int n) {
    return a + b <= Math.max(m, n) && Math.max(a, b) <= Math.min(m, n);
  }
}
