interface Triangular {
  static int triangular(int n) {
    return n > 0 ? n * (n + 1) / 2 : 0;
  }
}
