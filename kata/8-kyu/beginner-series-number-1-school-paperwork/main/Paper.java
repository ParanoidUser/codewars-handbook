interface Paper {
  static int paperWork(int n, int m) {
    return n > 0 && m > 0 ? n * m : 0;
  }
}