interface TriangleSum {
  static long getSum(long n) {
    return ++n * (4 * n - 1) * ++n / 6;
  }
}