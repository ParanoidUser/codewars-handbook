interface MutualRecursion {
  static int f(int n) {
    return n > 0 ? n - m(f(n - 1)) : 1;
  }

  static int m(int n) {
    return n > 0 ? n - f(m(n - 1)) : 0;
  }
}