interface Sequence {
  static int nthterm(int first, int n, int c) {
    return first + n * c;
  }
}