interface Sequence {
  static long getScore(long n) {
    return 25 * n * (n + 1);
  }
}
